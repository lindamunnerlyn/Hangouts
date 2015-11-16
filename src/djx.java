// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class djx extends dgj
{

    private final byte a[];

    public djx(aoa aoa1, byte abyte0[])
    {
        super(aoa1);
        a = abyte0;
    }

    public void a()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            int i = g.a(g.nU, "babel_hangout_invite_responds_to_mesi", 1);
            if (i != 1)
            {
                flag = flag1;
                if (i != 2)
                {
                    break label0;
                }
                flag = flag1;
                if (!super.b.b.a().endsWith("@google.com"))
                {
                    break label0;
                }
            }
            flag = true;
        }
        Object obj;
        if (flag)
        {
            obj = new cvm(a);
        } else
        {
            try
            {
                obj = (jkp)kws.mergeFrom(new jkp(), a);
                obj = new cxe(((jkp) (obj)).b, g.a(((jkp) (obj)).g, 0));
            }
            catch (kwr kwr1)
            {
                eev.e("Babel", "Parse failed", kwr1);
                kwr1 = null;
            }
        }
        if (obj != null)
        {
            a(((dmf) (obj)));
        }
    }
}
