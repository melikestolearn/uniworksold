################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../lecture\ 1/excercise1.cpp \
../lecture\ 1/excersise2.cpp \
../lecture\ 1/excersise3.cpp 

OBJS += \
./lecture\ 1/excercise1.o \
./lecture\ 1/excersise2.o \
./lecture\ 1/excersise3.o 

CPP_DEPS += \
./lecture\ 1/excercise1.d \
./lecture\ 1/excersise2.d \
./lecture\ 1/excersise3.d 


# Each subdirectory must supply rules for building sources it contributes
lecture\ 1/excercise1.o: ../lecture\ 1/excercise1.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"lecture 1/excercise1.d" -MT"lecture\ 1/excercise1.d" -o"$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '

lecture\ 1/excersise2.o: ../lecture\ 1/excersise2.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"lecture 1/excersise2.d" -MT"lecture\ 1/excersise2.d" -o"$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '

lecture\ 1/excersise3.o: ../lecture\ 1/excersise3.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"lecture 1/excersise3.d" -MT"lecture\ 1/excersise3.d" -o"$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


