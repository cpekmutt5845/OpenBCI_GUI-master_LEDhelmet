
//------------------------------------------------------------------------
//                       Global Variables & Instances
//------------------------------------------------------------------------

DataProcessing_User dataProcessing_user;
boolean drawEMG = false; //if true... toggles on EEG_Processing_User.draw and toggles off the headplot in Gui_Manager
boolean drawAccel = false;
boolean drawPulse = false;
boolean drawFFT = true;
boolean drawBionics = false;
boolean drawHead = true;

String oldCommand = "";
boolean hasGestured = false;


//------------------------------------------------------------------------
//                            Classes
//------------------------------------------------------------------------

class DataProcessing_User {
  private float fs_Hz;  //sample rate
  private int n_chan;

  boolean switchesActive = false;
  public boolean initialChecking = false;

  Button leftConfig = new Button(3*(width/4) - 65,height/4 - 120,20,20,"\\/",fontInfo.buttonLabel_size);
  Button midConfig = new Button(3*(width/4) + 63,height/4 - 120,20,20,"\\/",fontInfo.buttonLabel_size);
  Button rightConfig = new Button(3*(width/4) + 190,height/4 - 120,20,20,"\\/",fontInfo.buttonLabel_size);



  //class constructor
  DataProcessing_User(int NCHAN, float sample_rate_Hz) {
    n_chan = NCHAN;
    fs_Hz = sample_rate_Hz;
  }

  //add some functions here...if you'd like

  //here is the processing routine called by the OpenBCI main program...update this with whatever you'd like to do
  public void process(float[][] data_newest_uV, //holds raw bio data that is new since the last call
    float[][] data_long_uV, //holds a longer piece of buffered EEG data, of same length as will be plotted on the screen
    float[][] data_forDisplay_uV, //this data has been filtered and is ready for plotting on the screen
    FFT[] fftData) {              //holds the FFT (frequency spectrum) of the latest data

    //for example, you could loop over each EEG channel to do some sort of time-domain processing
    //using the sample values that have already been filtered, as will be plotted on the display
    float EEG_value_uV;

    //ome code

    //println("ch2:"+ data_forDisplay_uV[1][1999] +"ch4:"+ data_forDisplay_uV[3][1999]+"\n"); I just print for check value in ch.2 and ch.4
    //program will call this function all the time, so we can stream LED!
    setLedColorPerformed(data_forDisplay_uV);     
           
    //end here      
          
    }
    
    
  }
        
    //ome code
        
    //we throw value from each channel to this function
    private void setLedColorPerformed(float[][] data_forDisplay_uV){                                               
        try {
            println("Set LED Color\n");
              
            // I set red: 0, green: adaptive (up to value of each ch.) , blue: 0
            api.setElectrodeColor("Fp1",(byte) 0, (byte) LEDbrightness(data_forDisplay_uV[0][1999],200), (byte)0);
            api.setElectrodeColor("Fp2",(byte) 0,(byte) LEDbrightness(data_forDisplay_uV[1][1999],450), (byte)0);
            api.setElectrodeColor("C3",(byte) 0, (byte) LEDbrightness(data_forDisplay_uV[2][1999],200), (byte)0);
            api.setElectrodeColor("C4",(byte) 0,(byte) LEDbrightness(data_forDisplay_uV[3][1999],450), (byte)0);
            api.setElectrodeColor("F7",(byte) 0, (byte) LEDbrightness(data_forDisplay_uV[4][1999],200), (byte)0);
            api.setElectrodeColor("F8",(byte) 0,(byte) LEDbrightness(data_forDisplay_uV[5][1999],200), (byte)0);
            api.setElectrodeColor("O1",(byte) 0, (byte) LEDbrightness(data_forDisplay_uV[6][1999],200), (byte)0);
            api.setElectrodeColor("O2",(byte) 0,(byte) LEDbrightness(data_forDisplay_uV[7][1999],200), (byte)0);
            
            //checking by print LED color of each ch.
            api.printEnabledElectrodeColor();
            
            if(api.updateCaiShenColor())
                println("OK, setting LED\n");
            else
                println("ERROR: can't set LED\n"); 
        } catch (Exception ex) {
            println(ex.getMessage()+"\n");
        }
        
    }
 
    //this function use for set the brightness algorithm (1st argument: value of each channel, 2nd argument: this is divide value and you can pass another value except 200 for more accuracy LED display )
    private float LEDbrightness(float brightnessValue, int divider){
      float brightnessResult;
      
      if(brightnessValue < 0)
      brightnessResult = brightnessValue * -1; // get absolute value from negative number
      
      brightnessResult = (brightnessValue * 255 ) / divider;
      
      return brightnessResult;
    }
    
    //end here

  