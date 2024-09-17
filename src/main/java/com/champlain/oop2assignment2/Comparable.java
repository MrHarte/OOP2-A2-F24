package com.champlain.oop2assignment2;

import java.util.Collections;


public interface Comparable<Card> {
 public void sort(){Collections.sort(Collections.<Card>unmodifiableList(this.aCards));}


    }

