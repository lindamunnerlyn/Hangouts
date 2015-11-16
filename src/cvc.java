// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class cvc extends cui
{

    private static final long serialVersionUID = 1L;
    private final Map a = new HashMap();

    public cvc(List list)
    {
        ebj ebj1;
        for (list = list.iterator(); list.hasNext(); a.put(ebj1.a, ebj1.b))
        {
            ebj1 = (ebj)list.next();
        }

    }

    public String a()
    {
        return "event_queue";
    }

    public kop a(String s, int i, int j)
    {
        iyi iyi1 = new iyi();
        Object obj = new StringBuilder();
        iyi1.a = new ixh[a.size()];
        Iterator iterator = a.entrySet().iterator();
        for (int k = 0; iterator.hasNext(); k++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            ixh ixh1 = new ixh();
            int l = g.a((Integer)entry.getKey(), 0);
            boolean flag = g.a((Boolean)entry.getValue(), false);
            if (ctr.e)
            {
                ((StringBuilder) (obj)).append("{").append(l).append(", ").append(flag).append("} ");
            }
            ixh1.a = Integer.valueOf(l);
            ixh1.b = Boolean.valueOf(flag);
            iyi1.a[k] = ixh1;
        }

        if (ctr.e)
        {
            obj = String.valueOf(((StringBuilder) (obj)).toString());
            if (((String) (obj)).length() != 0)
            {
                obj = "SetRichPresenceEnabledStateRequest build protobuf. Values: ".concat(((String) (obj)));
            } else
            {
                obj = new String("SetRichPresenceEnabledStateRequest build protobuf. Values: ");
            }
            ebw.b("Babel_RequestWriter", ((String) (obj)));
        }
        iyi1.requestHeader = ctq.a(s, i, j, h);
        return iyi1;
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        ccg = ((cvc)ccg).a.entrySet().iterator();
        do
        {
            if (!ccg.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)ccg.next();
            if (a.get(entry.getKey()) == null)
            {
                a.put(entry.getKey(), entry.getValue());
            }
        } while (true);
        return true;
    }

    public String g()
    {
        return "presence/setrichpresenceenabledstate";
    }
}
