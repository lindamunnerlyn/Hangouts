// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aqo
    implements agc
{

    final long a;
    final edt b;
    final int c;
    final dpw d;
    final aqn e;

    aqo(aqn aqn1, long l, edt edt1, int i, dpw dpw)
    {
        e = aqn1;
        a = l;
        b = edt1;
        c = i;
        d = dpw;
        super();
    }

    public void a(Object obj)
    {
        dpm dpm1 = (dpm)obj;
        byte abyte0[] = dpm1.a();
        if (aqn.i())
        {
            long l = System.currentTimeMillis();
            long l1 = a;
            String s = String.valueOf(b.toString());
            int i = c;
            boolean flag;
            if (abyte0 != null)
            {
                obj = Integer.valueOf(abyte0.length);
            } else
            {
                obj = "null";
            }
            obj = String.valueOf(obj);
            flag = dpm1.c();
            eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(s).length() + 128 + String.valueOf(obj).length())).append("Volley: url=").append(s).append(", entryCount= ").append(i).append(" received=").append(((String) (obj))).append(", clock=").append(l).append(", dur=").append(l - l1).append("ms from volley cache: ").append(flag).toString());
        }
        if (abyte0 == null || abyte0.length == 0)
        {
            cdg.a(b.t());
            aqn.a(e, b, c + 1);
            return;
        } else
        {
            ((dpn)hlp.a(g.nU, dpn)).a(d, dpm1);
            return;
        }
    }
}
