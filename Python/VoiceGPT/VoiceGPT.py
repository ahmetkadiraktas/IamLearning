import openai
import pyttsx3
import speech_recognition as sr
import time

openai.api_key = "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"

engine =pyttsx3.init()

def transcribe_audio_to_text(filename):
    recognizer = sr.Recognizer()
    with sr.AudioFile(filename) as source:
        audio = recognizer.record(source)
    try:
        return recognizer.recognize_google(audio)
    except:
        print('Bilinmeyen hata')


def generate_response(prompt):
    response = openai.Completion.create(
         engine="text-davinci-003",
         prompt=prompt,
         max_tokens=4000,
         n=1,
         stop=None,
         temperature=0.5,
    )
    return response["choices"][0]["text"]

def speak_text(text):
    engine.say(text)
    engine.runAndWait()

def main():
    while True:
        print("başlaması için 'jarvis' diyin")
        with sr.Microphone() as source:
            recognizer = sr.Recognizer()
            audio= recognizer.listen(source)
            try:
                transcription =recognizer.recognize_google(audio)
                if transcription.lower()=="jarvis":
                    filename="input.wav"
                    print("sorunu sor...")
                    with sr.Microphone() as source:
                        recognizer =sr.Recognizer()
                        source.pause_threshold=1
                        audio=recognizer.listen(source, phrase_time_limit=None, timeout=None)
                        with open(filename, "wb" )as f:
                            f.write(audio.get_wav_data())                    
   
    