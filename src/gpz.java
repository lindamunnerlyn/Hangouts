// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class gpz
{

    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;

    public gpz()
    {
    }

    private gpz(gpz gpz1)
    {
        a = gpz1.a;
        b = gpz1.b;
        c = gpz1.c;
        d = gpz1.d;
        e = gpz1.e;
        f = gpz1.f;
        g = gpz1.g;
        h = gpz1.h;
    }

    public float a(float f1)
    {
        if (f1 == 0.0F)
        {
            return a;
        }
        if (f1 == 1.0F)
        {
            return g;
        } else
        {
            float f2 = a;
            f2 += (c - f2) * f1;
            float f3 = c;
            f3 += (e - f3) * f1;
            float f4 = e;
            float f5 = g;
            f2 += (f3 - f2) * f1;
            return f2 + ((f3 + ((f4 + (f5 - f4) * f1) - f3) * f1) - f2) * f1;
        }
    }

    public gpz a()
    {
        return new gpz(this);
    }

    public float b(float f1)
    {
        if (f1 == 0.0F)
        {
            return b;
        }
        if (f1 == 1.0F)
        {
            return h;
        } else
        {
            float f2 = b;
            f2 += (d - f2) * f1;
            float f3 = d;
            f3 += (f - f3) * f1;
            float f4 = f;
            float f5 = h;
            f2 += (f3 - f2) * f1;
            return f2 + ((f3 + ((f4 + (f5 - f4) * f1) - f3) * f1) - f2) * f1;
        }
    }

    public float c(float f1)
    {
        float f2;
        float f4;
        float f5;
        f4 = 1.0F;
        f5 = 0.0F;
        f2 = (f1 - a) / (g - a);
        if (f2 > 0.0F) goto _L2; else goto _L1
_L1:
        return f5;
_L2:
        float f3;
        if (f2 >= 1.0F)
        {
            return 1.0F;
        }
        int i = 0;
        f5 = 0.0F;
        f3 = 0.0F;
label0:
        do
        {
label1:
            {
                if (i >= 8)
                {
                    break label1;
                }
                float f7 = a(f2);
                float f8 = (a(f2 + 1E-06F) - f7) / 1E-06F;
                f5 = f2;
                if (Math.abs(f7 - f1) < 1E-06F)
                {
                    break label0;
                }
                f5 = f7;
                if (Math.abs(f8) < 1E-06F)
                {
                    break label1;
                }
                if (f7 < f1)
                {
                    f3 = f2;
                } else
                {
                    f4 = f2;
                }
                f5 = (f7 - f1) / f8;
                i++;
                f2 -= f5;
                f5 = f7;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        int j = 0;
        while (Math.abs(f5 - f1) > 1E-06F && j < 8) 
        {
            if (f5 < f1)
            {
                f5 = (f2 + f4) / 2.0F;
                f3 = f2;
                f2 = f5;
            } else
            {
                float f6 = (f2 + f3) / 2.0F;
                f4 = f2;
                f2 = f6;
            }
            f5 = a(f2);
            j++;
        }
        return f2;
    }

    public Object clone()
    {
        return a();
    }
}
