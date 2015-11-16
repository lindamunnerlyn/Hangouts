// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kwx
{

    public static final int a[] = new int[0];
    public static final long b[] = new long[0];
    public static final float c[] = new float[0];
    public static final double d[] = new double[0];
    public static final boolean e[] = new boolean[0];
    public static final String f[] = new String[0];
    public static final byte g[][] = new byte[0][];
    public static final byte h[] = new byte[0];

    public static final int a(kwj kwj1, int i)
    {
        int j = 1;
        int k = kwj1.r();
        kwj1.b(i);
        while (kwj1.a() == i) 
        {
            kwj1.b(i);
            j++;
        }
        kwj1.e(k);
        return j;
    }

}
