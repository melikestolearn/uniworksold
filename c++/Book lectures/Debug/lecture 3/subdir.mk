################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../lecture\ 3/excercise1.cpp \
../lecture\ 3/excercise2.cpp \
../lecture\ 3/excersise3.cpp 

OBJS += \
./lecture\ 3/excercise1.o \
./lecture\ 3/excercise2.o \
./lecture\ 3/excersise3.o 

CPP_DEPS += \
./lecture\ 3/excercise1.d \
./lecture\ 3/excercise2.d \
./lecture\ 3/excersise3.d 


# Each subdirectory must supply rules for building sources it contributes
lecture\ 3/excercise1.o: ../lecture\ 3/excercise1.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"lecture 3/excercise1.d" -MT"lecture\ 3/excercise1.d" -o"$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '

lecture\ 3/excercise2.o: ../lecture\ 3/excercise2.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"lecture 3/excercise2.d" -MT"lecture\ 3/excercise2.d" -o"$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '

lecture\ 3/excersise3.o: ../lecture\ 3/excersise3.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"lecture 3/excersise3.d" -MT"lecture\ 3/excersise3.d" -o"$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


