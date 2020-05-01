#!/bin/bash


#if test ! -e $HOME/visualstudio/VS.iso ; then

#curl http://download.microsoft.com/download/8/1/d/81d3f35e-fa03-485b-953b-ff952e402520/VS2008ProEdition90dayTrialENUX1435622.iso > $HOME/VS.iso

choco install imdisk

ls -l /c/Windows/system32/imdisk.exe
which imdisk.exe

ls -l $HOME/VS.iso

/c/Windows/system32/imdisk.exe --help




imdisk.exe -a -f $HOME/VS.iso -m "V:"

ls /v


