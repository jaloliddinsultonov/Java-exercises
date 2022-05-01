package com.company;

public class task_4 {
    public static void age_decider(int age) throws childException, adultException, teenagerException{
        if(age < 13){
            throw new childException("You are a child");
        }
        else if(age>=13 && age < 18){
            throw new teenagerException("You are a teenager");
        }
        else if(age>=18){
            throw new adultException(("You are an adult"));
        }
    }

    public static void main(String args[]){
        try{
            age_decider(19);
        }
        catch (childException e){
            System.out.println(e);
        }
        catch (teenagerException e){
            System.out.println(e);
        }
        catch (adultException e){
            System.out.println(e);
        }
    }
}
