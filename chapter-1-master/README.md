# Chapter-1
#把下面这一段，根据需要修改编辑后，复制到 .bash_profile 中   

export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_111.jdk/Contents/Home   
#需要根据你安装 JDK 的路径去修改上面的路径   
export PATH=${PATH}:${JAVA_HOME}/bin  
export CLASSPATH=.:${JAVA_HOME}/lib/dt.jar:${JAVA_HOME}/lib/tools.jar  

export ANDROID_HOME=/usr/local/opt/android-sdk   
#需要根据你安装 android-sdk 路径去修改上面的路径   
export PATH=${PATH}:${ANDROID_HOME}/tools   
export PATH=${PATH}:${ANDROID_HOME}/platform-tools   
export PATH=${PATH}:${ANDROID_HOME}/build-tools/30.0.1   
#需要根据版本，去修改 build-tolls 的版本，这里是 30.0.1   
