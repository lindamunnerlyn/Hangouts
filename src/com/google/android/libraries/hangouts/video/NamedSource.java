// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;


public class NamedSource
{

    public final String a;
    public final String b;
    public final int c;

    public NamedSource(String s, String s1, int i)
    {
        a = s;
        b = s1;
        c = i;
    }

    public boolean equals(Object obj)
    {
        return obj != null && (obj instanceof NamedSource) && ((NamedSource)obj).c == c;
    }

    public int hashCode()
    {
        return c;
    }

    public String toString()
    {
        String s = b;
        String s1 = a;
        int i = c;
        return (new StringBuilder(String.valueOf(s).length() + 15 + String.valueOf(s1).length())).append(s).append(" (").append(s1).append("/").append(i).append(")").toString();
    }
}
