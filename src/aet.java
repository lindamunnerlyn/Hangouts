// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedReader;
import java.io.Reader;

public final class aet extends BufferedReader
{

    private long a;
    private boolean b;
    private String c;

    public aet(Reader reader)
    {
        super(reader);
    }

    public String a()
    {
        if (!b)
        {
            long l = System.currentTimeMillis();
            String s = super.readLine();
            a = (System.currentTimeMillis() - l) + a;
            c = s;
            b = true;
        }
        return c;
    }

    public String readLine()
    {
        if (b)
        {
            String s = c;
            c = null;
            b = false;
            return s;
        } else
        {
            long l = System.currentTimeMillis();
            String s1 = super.readLine();
            a = (System.currentTimeMillis() - l) + a;
            return s1;
        }
    }
}
