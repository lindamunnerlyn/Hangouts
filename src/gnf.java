// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gnf
{

    private static final float a[] = {
        1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 
        1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F
    };
    private static final float b[] = {
        -1F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 
        1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F
    };
    private static final float c[] = {
        1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 
        1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F
    };
    private static final float d[] = {
        0.0F, 1.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 
        1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F
    };
    private static final float e[] = {
        -1F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 
        1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F
    };
    private static final float f[] = {
        0.0F, -1F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 
        1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F
    };

    public static void a(float af[], float af1[], float af2[])
    {
        af2[0] = af[0] * af1[0] + af[4] * af1[1] + af[8] * af1[2] + af[12] * af1[3];
        af2[1] = af[1] * af1[0] + af[5] * af1[1] + af[9] * af1[2] + af[13] * af1[3];
        af2[2] = af[2] * af1[0] + af[6] * af1[1] + af[10] * af1[2] + af[14] * af1[3];
        af2[3] = af[3] * af1[0] + af[7] * af1[1] + af[11] * af1[2] + af[15] * af1[3];
        af2[4] = af[0] * af1[4] + af[4] * af1[5] + af[8] * af1[6] + af[12] * af1[7];
        af2[5] = af[1] * af1[4] + af[5] * af1[5] + af[9] * af1[6] + af[13] * af1[7];
        af2[6] = af[2] * af1[4] + af[6] * af1[5] + af[10] * af1[6] + af[14] * af1[7];
        af2[7] = af[3] * af1[4] + af[7] * af1[5] + af[11] * af1[6] + af[15] * af1[7];
        af2[8] = af[0] * af1[8] + af[4] * af1[9] + af[8] * af1[10] + af[12] * af1[11];
        af2[9] = af[1] * af1[8] + af[5] * af1[9] + af[9] * af1[10] + af[13] * af1[11];
        af2[10] = af[2] * af1[8] + af[6] * af1[9] + af[10] * af1[10] + af[14] * af1[11];
        af2[11] = af[3] * af1[8] + af[7] * af1[9] + af[11] * af1[10] + af[15] * af1[11];
        af2[12] = af[0] * af1[12] + af[4] * af1[13] + af[8] * af1[14] + af[12] * af1[15];
        af2[13] = af[1] * af1[12] + af[5] * af1[13] + af[9] * af1[14] + af[13] * af1[15];
        af2[14] = af[2] * af1[12] + af[6] * af1[13] + af[10] * af1[14] + af[14] * af1[15];
        af2[15] = af[3] * af1[12] + af[7] * af1[13] + af[11] * af1[14] + af[15] * af1[15];
    }

    public static float[] a()
    {
        return a;
    }

    public static float[] b()
    {
        return d;
    }

    public static float[] c()
    {
        return e;
    }

    public static float[] d()
    {
        return f;
    }

}
