// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dil extends dfa
{

    private final byte a[];

    public dil(ani ani1, byte abyte0[])
    {
        super(ani1);
        a = abyte0;
    }

    public void a()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            int i = g.a(g.nS, "babel_hangout_invite_responds_to_mesi", 1);
            if (i != 1)
            {
                flag = flag1;
                if (i != 2)
                {
                    break label0;
                }
                flag = flag1;
                if (!b.a().endsWith("@google.com"))
                {
                    break label0;
                }
            }
            flag = true;
        }
        Object obj;
        if (flag)
        {
            obj = new ctj(a);
        } else
        {
            try
            {
                obj = (jed)kop.mergeFrom(new jed(), a);
                obj = new cva(((jed) (obj)).b, g.a(((jed) (obj)).g, 0));
            }
            catch (koo koo1)
            {
                ebw.e("Babel", "Parse failed", koo1);
                koo1 = null;
            }
        }
        if (obj != null)
        {
            c.a(((dko) (obj)));
        }
    }
}
