// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.OutputStream;

public final class hrv extends OutputStream
{

    public long a;

    public hrv()
    {
    }

    public void write(int i)
    {
        a = a + 1L;
    }

    public void write(byte abyte0[], int i, int j)
    {
        a = a + (long)j;
    }
}
