// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;
import java.util.ArrayList;

final class kxf
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

    kxf()
    {
        k = new ArrayList();
        l = new ArrayList();
        m = null;
    }

    public kxf a(kxf kxf1)
    {
        kxf kxf2;
label0:
        {
            kxf2 = new kxf();
            kxf2.a = kxf1.a;
            kxf2.b = a;
            kxf2.c = kxf1.c;
            kxf2.d = kxf1.d;
            kxf2.f = kxf1.f;
            kxf2.e = kxf1.e;
            kxf2.g = kxf1.g;
            kxf2.h = kxf1.h;
            kxf2.i = kxf1.i;
            kxf2.j = kxf1.j;
            kxf2.k = k;
            kxf2.l = l;
            kxf2.m = m;
            if (kxf1.m != null)
            {
                if (m != null)
                {
                    break label0;
                }
                kxf2.m = kxf1.m;
            }
            return kxf2;
        }
        Matrix matrix = new Matrix(m);
        matrix.preConcat(kxf1.m);
        kxf2.m = matrix;
        return kxf2;
    }
}
