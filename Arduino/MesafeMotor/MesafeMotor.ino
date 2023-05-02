const int TriggerPin = 3; //Trig pin
const int EchoPin = 2; //Echo pin
long Duration = 0;

void setup(){
pinMode(TriggerPin,OUTPUT); // Trigger output
pinMode(EchoPin,INPUT); // Echo input
Serial.begin(9600); // Serial Output
}

void loop(){
digitalWrite(TriggerPin, LOW);
delayMicroseconds(2);
digitalWrite(TriggerPin, HIGH); // Trigger pin tHIGH
delayMicroseconds(10); // 10us high
digitalWrite(TriggerPin, LOW); // Trigger pin  HIGH

Duration = pulseIn(EchoPin,HIGH);

long Distance_mm = Distance(Duration);




delay(1000);
}

long Distance(long time)
{
// Calculates the Distance in mm
// ((time)*(Speed of sound))/ toward and backward of object) * 10

long DistanceCalc; // Calculation variable
DistanceCalc = ((time /2.9) / 2); // Actual calculation in mm
//DistanceCalc = time / 74 / 2; // Actual calculation in inches
return DistanceCalc; // return calculated value
}