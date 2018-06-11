#!/bin/bash

if [ $(ps -a | grep "iTerm" | wc -l ) -eq 2 ]
then
    cd ~/blink
    java loader
fi