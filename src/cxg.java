// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class cxg extends cwm
{

    private static final long serialVersionUID = 1L;
    private final Map a = new HashMap();

    public cxg(List list)
    {
        eeh eeh1;
        for (list = list.iterator(); list.hasNext(); a.put(eeh1.a, eeh1.b))
        {
            eeh1 = (eeh)list.next();
        }

    }

    public String a()
    {
        return "event_queue";
    }

    public kws a(String s, int i, int j)
    {
        jen jen1 = new jen();
        Object obj = new StringBuilder();
        jen1.a = new jdm[a.size()];
        Iterator iterator = a.entrySet().iterator();
        for (int k = 0; iterator.hasNext(); k++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            jdm jdm1 = new jdm();
            int l = g.a((Integer)entry.getKey(), 0);
            boolean flag = g.a((Boolean)entry.getValue(), false);
            if (cvv.e)
            {
                ((StringBuilder) (obj)).append("{").append(l).append(", ").append(flag).append("} ");
            }
            jdm1.a = Integer.valueOf(l);
            jdm1.b = Boolean.valueOf(flag);
            jen1.a[k] = jdm1;
        }

        if (cvv.e)
        {
            obj = String.valueOf(((StringBuilder) (obj)).toString());
            if (((String) (obj)).length() != 0)
            {
                obj = "SetRichPresenceEnabledStateRequest build protobuf. Values: ".concat(((String) (obj)));
            } else
            {
                obj = new String("SetRichPresenceEnabledStateRequest build protobuf. Values: ");
            }
            eev.b("Babel_RequestWriter", ((String) (obj)));
        }
        jen1.requestHeader = cvu.a(s, i, j, h);
        return jen1;
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        cdl = ((cxg)cdl).a.entrySet().iterator();
        do
        {
            if (!cdl.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)cdl.next();
            if (a.get(entry.getKey()) == null)
            {
                a.put(entry.getKey(), entry.getValue());
            }
        } while (true);
        return true;
    }

    public String f()
    {
        return "presence/setrichpresenceenabledstate";
    }
}
