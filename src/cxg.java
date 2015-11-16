// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class cxg extends cvn
{

    private static final long serialVersionUID = 1L;
    private final List g;

    private cxg(iwr iwr1)
    {
        super(iwr1.responseHeader, -1L);
        iwn aiwn[] = iwr1.a;
        ArrayList arraylist = new ArrayList();
        long l = System.currentTimeMillis();
        int j = aiwn.length;
        int i = 0;
        while (i < j) 
        {
            Object obj1 = aiwn[i];
            if (((iwn) (obj1)).a == null || TextUtils.isEmpty(((iwn) (obj1)).a.b))
            {
                ebw.g("Babel", "Received empty gaiaid in parseClientUserPresenceList.");
            } else
            if (((iwn) (obj1)).b == null)
            {
                if (((iwn) (obj1)).c != null)
                {
                    Object obj = new csy(((iwn) (obj1)).c);
                    obj1 = String.valueOf(((iwn) (obj1)).a.b);
                    obj = ((csy) (obj)).b;
                    ebw.f("Babel", (new StringBuilder(String.valueOf(obj1).length() + 39 + String.valueOf(obj).length())).append("Received presence error for ").append(((String) (obj1))).append(". Details: ").append(((String) (obj))).toString());
                }
            } else
            {
                arraylist.add(new czu(((iwn) (obj1)).b, ((iwn) (obj1)).a.b, l));
            }
            i++;
        }
        g = arraylist;
        if (cvn.a)
        {
            iwr1 = String.valueOf(iwr1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(iwr1).length() + 27)).append("QueryPresenceResponse from:").append(iwr1).toString());
        }
    }

    public static cvn parseFrom(iwr iwr1)
    {
        if (a(iwr1.responseHeader))
        {
            return new cvz(iwr1.responseHeader);
        } else
        {
            return new cxg(iwr1);
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        return parseFrom((iwr)kop.mergeFrom(new iwr(), abyte0));
    }

    public void a(dko dko)
    {
        super.a(dko);
        int j = ((dey)dko).b().size();
        int i;
        if (g != null)
        {
            i = g.size();
        } else
        {
            i = 0;
        }
        if (j != i)
        {
            ebw.f("Babel", (new StringBuilder(71)).append("Queried presence for ").append(j).append(", but only get response for ").append(i).toString());
        }
    }

    public List k()
    {
        return g;
    }
}
