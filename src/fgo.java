// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fgo
{

    public static final int a[] = new int[0];
    public static final long b[] = new long[0];
    public static final float c[] = new float[0];
    public static final double d[] = new double[0];
    public static final boolean e[] = new boolean[0];
    public static final String f[] = new String[0];
    public static final byte g[][] = new byte[0][];
    public static final byte h[] = new byte[0];

    public static final int a(fgf fgf1, int i)
    {
        int j = 1;
        int k = fgf1.m();
        fgf1.b(i);
        while (fgf1.a() == i) 
        {
            fgf1.b(i);
            j++;
        }
        fgf1.e(k);
        return j;
    }

}
