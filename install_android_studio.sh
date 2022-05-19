#!/bin/bash

ANDROID_STUDIO_URL=https://dl.google.com/dl/android/studio/ide-zips/3.5.3.0/android-studio-ide-191.6010548-linux.tar.gz
ANDROID_STUDIO_VERSION=3.5

wget "$ANDROID_STUDIO_URL" -O android-studio.tar.gz
tar xzvf android-studio.tar.gz
rm android-studio.tar.gz

apt install -y qemu-kvm

sudo chown codespace: /dev/kvm
