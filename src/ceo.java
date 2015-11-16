// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ceo extends cef
{

    final cen b;

    ceo(cen cen1)
    {
        b = cen1;
        super(cen1);
    }

    public void a(ebh ebh1, eab eab, boolean flag, apw apw, boolean flag1)
    {
        gbh.a(eab);
        android.graphics.Bitmap bitmap;
        if (flag)
        {
            bitmap = ebh1.d();
        } else
        {
            bitmap = anv.c();
        }
        if (cdu.b)
        {
            String s = String.valueOf(bitmap);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 38)).append("setImageBitmap: success ").append(flag).append(" bitmap: ").append(s).toString());
        }
        ((cd)b.s).a(bitmap);
        b.t.a(b.s);
        if (ccx.a(b.o))
        {
            cf cf1 = new cf(b.o);
            cs cs1 = new cs();
            cs1.b();
            cs1.a(bitmap);
            cf1.a(cs1);
            b.u.a(cf1.g());
        }
        super.a(ebh1, eab, flag, apw, flag1);
    }
}
