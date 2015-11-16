// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class apx
    implements aga
{

    final long a;
    final eap b;
    final int c;
    final dnc d;
    final apw e;

    apx(apw apw1, long l, eap eap1, int i, dnc dnc)
    {
        e = apw1;
        a = l;
        b = eap1;
        c = i;
        d = dnc;
        super();
    }

    public void a(Object obj)
    {
        dms dms1 = (dms)obj;
        byte abyte0[] = dms1.a();
        if (apw.i())
        {
            long l = System.currentTimeMillis();
            long l1 = a;
            String s = b.toString();
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
            flag = dms1.c();
            ebw.b("Babel_medialoader", (new StringBuilder(String.valueOf(s).length() + 128 + String.valueOf(obj).length())).append("Volley: url=").append(s).append(", entryCount= ").append(i).append(" received=").append(((String) (obj))).append(", clock=").append(l).append(", dur=").append(l - l1).append("ms from volley cache: ").append(flag).toString());
        }
        if (abyte0 == null || abyte0.length == 0)
        {
            ccb.a(b.t());
            apw.a(e, b, c + 1);
            return;
        } else
        {
            ((dmt)hgx.a(g.nS, dmt)).a(d, dms1);
            return;
        }
    }
}
