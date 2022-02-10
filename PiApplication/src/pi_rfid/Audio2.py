#!/usr/bin/env python

import pygame
pygame.mixer.init(44100, -16, 1, 1024)
pygame.mixer.music.load("/home/pi/pi-rfid/Sounds/Animals/Dog.wav")

pygame.mixer.music.play()
while pygame.mixer.music.get_busy() == True:
    continue
