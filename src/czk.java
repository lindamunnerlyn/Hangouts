// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class czk extends cxr
{

    private static final long serialVersionUID = 1L;
    private final List g;

    private czk(jcw jcw1)
    {
        super(jcw1.responseHeader, -1L);
        jcs ajcs[] = jcw1.a;
        ArrayList arraylist = new ArrayList();
        long l = System.currentTimeMillis();
        int j = ajcs.length;
        int i = 0;
        while (i < j) 
        {
            Object obj1 = ajcs[i];
            if (((jcs) (obj1)).a == null || TextUtils.isEmpty(((jcs) (obj1)).a.b))
            {
                eev.g("Babel", "Received empty gaiaid in parseClientUserPresenceList.");
            } else
            if (((jcs) (obj1)).b == null)
            {
                if (((jcs) (obj1)).c != null)
                {
                    Object obj = new cvb(((jcs) (obj1)).c);
                    obj1 = String.valueOf(((jcs) (obj1)).a.b);
                    obj = ((cvb) (obj)).b;
                    eev.f("Babel", (new StringBuilder(String.valueOf(obj1).length() + 39 + String.valueOf(obj).length())).append("Received presence error for ").append(((String) (obj1))).append(". Details: ").append(((String) (obj))).toString());
                }
            } else
            {
                arraylist.add(new dba(((jcs) (obj1)).b, ((jcs) (obj1)).a.b, l));
            }
            i++;
        }
        g = arraylist;
        if (cxr.a)
        {
            jcw1 = String.valueOf(jcw1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jcw1).length() + 27)).append("QueryPresenceResponse from:").append(jcw1).toString());
        }
    }

    public static cxr parseFrom(jcw jcw1)
    {
        if (a(jcw1.responseHeader))
        {
            return new cyd(jcw1.responseHeader);
        } else
        {
            return new czk(jcw1);
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        return parseFrom((jcw)kws.mergeFrom(new jcw(), abyte0));
    }

    public void a(dmf dmf)
    {
        super.a(dmf);
        int j = ((dgh)dmf).b().size();
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
            eev.f("Babel", (new StringBuilder(71)).append("Queried presence for ").append(j).append(", but only get response for ").append(i).toString());
        }
    }

    public List k()
    {
        return g;
    }
}
