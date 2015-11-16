// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cft extends cfk
{

    final cfs b;

    cft(cfs cfs1)
    {
        b = cfs1;
        super(cfs1);
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn, boolean flag1)
    {
        gdv.a("Expected null", edf);
        android.graphics.Bitmap bitmap;
        if (flag)
        {
            bitmap = eef1.d();
        } else
        {
            bitmap = aon.c();
        }
        if (cez.b)
        {
            String s = String.valueOf(bitmap);
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 38)).append("setImageBitmap: success ").append(flag).append(" bitmap: ").append(s).toString());
        }
        ((cd)b.s).a(bitmap);
        b.t.a(b.s);
        if (cec.a(b.o))
        {
            cf cf1 = new cf(b.o);
            cs cs1 = new cs();
            cs1.b();
            cs1.a(bitmap);
            cf1.a(cs1);
            b.u.a(cf1.g());
        }
        super.a(eef1, edf, flag, aqn, flag1);
    }
}
