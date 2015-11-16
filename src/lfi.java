// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;
import java.util.ArrayList;

final class lfi
{

    String a;
    String b;
    boolean c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    ArrayList k;
    ArrayList l;
    Matrix m;

    lfi()
    {
        k = new ArrayList();
        l = new ArrayList();
        m = null;
    }

    public lfi a(lfi lfi1)
    {
        lfi lfi2;
label0:
        {
            lfi2 = new lfi();
            lfi2.a = lfi1.a;
            lfi2.b = a;
            lfi2.c = lfi1.c;
            lfi2.d = lfi1.d;
            lfi2.f = lfi1.f;
            lfi2.e = lfi1.e;
            lfi2.g = lfi1.g;
            lfi2.h = lfi1.h;
            lfi2.i = lfi1.i;
            lfi2.j = lfi1.j;
            lfi2.k = k;
            lfi2.l = l;
            lfi2.m = m;
            if (lfi1.m != null)
            {
                if (m != null)
                {
                    break label0;
                }
                lfi2.m = lfi1.m;
            }
            return lfi2;
        }
        Matrix matrix = new Matrix(m);
        matrix.preConcat(lfi1.m);
        lfi2.m = matrix;
        return lfi2;
    }
}
