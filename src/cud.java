// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cud extends cui
{

    private static final int j[] = {
        1
    };
    private static final long serialVersionUID = 1L;
    public List a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public cud(List list, String s, boolean flag, boolean flag1)
    {
        a = list;
        d = flag;
        b = s;
        c = flag1;
    }

    private void r()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dac dac1 = (dac)iterator.next();
            if (dac1 != null)
            {
                arraylist.add(dac1);
            }
        } while (true);
        a = arraylist;
    }

    public kop a(String s, int i, int k)
    {
        boolean flag = false;
        if (ctr.e)
        {
            String s1 = String.valueOf(a);
            ebw.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 34)).append("GetEntityByIdRequest: lookupSpecs=").append(s1).toString());
        }
        its its1 = new its();
        its1.requestHeader = ctq.a(null, true, s, i, k, h);
        its1.b = j;
        s = a.iterator();
        i = 0;
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            if ((dac)s.next() != null)
            {
                i++;
            }
        } while (true);
        if (i > 0)
        {
            its1.a = new ist[i];
        }
        if (i < a.size())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        s = a.iterator();
        k = i;
        i = ((flag) ? 1 : 0);
        while (s.hasNext()) 
        {
            dac dac1 = (dac)s.next();
            if (dac1 == null)
            {
                ebw.g("Babel_RequestWriter", "GetEntityByIdRequest: null spec!");
                k = 1;
            } else
            {
                its1.a[i] = dac1.d();
                i++;
            }
        }
        if (k != 0)
        {
            r();
        }
        return its1;
    }

    public void a(ani ani1, dbo dbo)
    {
        if (c)
        {
            Object obj = dgy.b(ani1.h());
            if (((dgy) (obj)).d() == 2)
            {
                dbo = String.valueOf(ebw.b(ani1.a()));
                if (dbo.length() != 0)
                {
                    dbo = "RefreshParticipantsOperation failed: ".concat(dbo);
                } else
                {
                    dbo = new String("RefreshParticipantsOperation failed: ");
                }
                ebw.f("Babel_RequestWriter", dbo);
                ((dgy) (obj)).a(0);
            }
        }
        if (!d)
        {
            for (dbo = a.iterator(); dbo.hasNext(); dlb.a(ani1).a(((dac) (obj))))
            {
                obj = (dac)dbo.next();
            }

        }
    }

    public boolean a(cci cci, dbo dbo)
    {
        return !d && super.a(cci, dbo);
    }

    public long b()
    {
        if (d)
        {
            return 0L;
        } else
        {
            return super.b();
        }
    }

    public String g()
    {
        return "contacts/getentitybyid";
    }

}
