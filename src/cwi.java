// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cwi extends cvn
{

    private static final long serialVersionUID = 1L;
    private final List g;

    private cwi(itt itt1)
    {
        Object obj = null;
        super(itt1.responseHeader, -1L);
        itu aitu[] = itt1.b;
        if (aitu == null)
        {
            itt1 = obj;
        } else
        {
            obj1 = new ArrayList();
            int k1 = aitu.length;
            int j = 0;
            while (j < k1) 
            {
                itt1 = aitu[j];
                Object obj2 = dac.a(((itu) (itt1)).a);
                Object obj3 = g.a(((itu) (itt1)).b, ((dac) (obj2)));
                if (obj3 != null)
                {
                    String s;
                    String s1;
                    String s2;
                    int j1;
                    if (!TextUtils.isEmpty(((dac) (obj2)).c))
                    {
                        itt1 = ((dac) (obj2)).c;
                    } else
                    if (!TextUtils.isEmpty(((dac) (obj2)).d))
                    {
                        itt1 = ((dac) (obj2)).d;
                    } else
                    {
                        itt1 = null;
                    }
                    if (!TextUtils.isEmpty(itt1))
                    {
                        for (int i1 = 0; i1 < obj3.length; i1++)
                        {
                            if (obj3[i1] != null)
                            {
                                obj3[i1].c(itt1);
                            }
                        }

                    }
                }
                ((List) (obj1)).add(new ebj(((java.io.Serializable) (obj2)), ((java.io.Serializable) (obj3))));
                j++;
            }
            itt1 = ((itt) (obj1));
        }
        g = itt1;
        if (cvn.a)
        {
            int i = g.size();
            ebw.b("Babel", (new StringBuilder(50)).append("GetEntityByIdResponse: Number of specs=").append(i).toString());
            for (itt1 = g.iterator(); itt1.hasNext();)
            {
                Object obj1 = (ebj)itt1.next();
                if (obj1 == null || ((ebj) (obj1)).b == null)
                {
                    ebw.b("Babel", "- GetEntityByIdResponse: Invalid Entry.");
                } else
                {
                    if (((ebj) (obj1)).b == null)
                    {
                        j = 0;
                    } else
                    {
                        j = ((ceu[])((ebj) (obj1)).b).length;
                    }
                    ebw.b("Babel", (new StringBuilder(55)).append("- GetEntityByIdResponse: Number of entities=").append(j).toString());
                    obj1 = (ceu[])((ebj) (obj1)).b;
                    j1 = obj1.length;
                    j = 0;
                    while (j < j1) 
                    {
                        s2 = obj1[j];
                        if (s2 == null)
                        {
                            ebw.b("Babel", "-- entity: null");
                        } else
                        {
                            s = String.valueOf(((ceu) (s2)).e);
                            obj2 = String.valueOf(((ceu) (s2)).f);
                            obj3 = String.valueOf(((ceu) (s2)).h);
                            s1 = String.valueOf(((ceu) (s2)).b);
                            s2 = String.valueOf(((ceu) (s2)).d);
                            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 70 + String.valueOf(obj2).length() + String.valueOf(obj3).length() + String.valueOf(s1).length() + String.valueOf(s2).length())).append("-- entity: displayName ").append(s).append(",firstName ").append(((String) (obj2))).append(",avatarUrl ").append(((String) (obj3))).append(",participantId ").append(s1).append(",circleId ").append(s2).toString());
                        }
                        j++;
                    }
                }
            }

        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (itt)kop.mergeFrom(new itt(), abyte0);
        if (a(((itt) (abyte0)).responseHeader))
        {
            return new cvz(((itt) (abyte0)).responseHeader);
        } else
        {
            return new cwi(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        if (ebw.a("Babel", 3))
        {
            if (b != null)
            {
                dfb = l();
                ebw.d("Babel", (new StringBuilder(String.valueOf(dfb).length() + 24)).append("GEBI Response for: ").append(dfb).append(" tag.").toString());
            } else
            {
                ebw.d("Babel", "GEBI Response with null request!");
            }
        }
        if (!m() && g != null)
        {
            dlb.a(aoe1.f(), this);
        }
    }

    public List k()
    {
        return g;
    }

    public String l()
    {
        return ((cud)b).b;
    }

    public boolean m()
    {
        return ((cud)b).d;
    }

    public boolean n()
    {
        return ((cud)b).c;
    }
}
