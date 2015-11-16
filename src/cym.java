// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cym extends cxr
{

    private static final long serialVersionUID = 1L;
    private final List g;

    private cym(izy izy1)
    {
        Object obj = null;
        super(izy1.responseHeader, -1L);
        izz aizz[] = izy1.b;
        if (aizz == null)
        {
            izy1 = obj;
        } else
        {
            obj1 = new ArrayList();
            int k1 = aizz.length;
            int j = 0;
            while (j < k1) 
            {
                izy1 = aizz[j];
                Object obj2 = dbi.a(((izz) (izy1)).a);
                Object obj3 = g.a(((izz) (izy1)).b, ((dbi) (obj2)));
                if (obj3 != null)
                {
                    String s;
                    String s1;
                    String s2;
                    int j1;
                    if (!TextUtils.isEmpty(((dbi) (obj2)).c))
                    {
                        izy1 = ((dbi) (obj2)).c;
                    } else
                    if (!TextUtils.isEmpty(((dbi) (obj2)).d))
                    {
                        izy1 = ((dbi) (obj2)).d;
                    } else
                    {
                        izy1 = null;
                    }
                    if (!TextUtils.isEmpty(izy1))
                    {
                        for (int i1 = 0; i1 < obj3.length; i1++)
                        {
                            if (obj3[i1] != null)
                            {
                                obj3[i1].c(izy1);
                            }
                        }

                    }
                }
                ((List) (obj1)).add(new eeh(((java.io.Serializable) (obj2)), ((java.io.Serializable) (obj3))));
                j++;
            }
            izy1 = ((izy) (obj1));
        }
        g = izy1;
        if (cxr.a)
        {
            int i = g.size();
            eev.b("Babel", (new StringBuilder(50)).append("GetEntityByIdResponse: Number of specs=").append(i).toString());
            for (izy1 = g.iterator(); izy1.hasNext();)
            {
                Object obj1 = (eeh)izy1.next();
                if (obj1 == null || ((eeh) (obj1)).b == null)
                {
                    eev.b("Babel", "- GetEntityByIdResponse: Invalid Entry.");
                } else
                {
                    if (((eeh) (obj1)).b == null)
                    {
                        j = 0;
                    } else
                    {
                        j = ((cfz[])((eeh) (obj1)).b).length;
                    }
                    eev.b("Babel", (new StringBuilder(55)).append("- GetEntityByIdResponse: Number of entities=").append(j).toString());
                    obj1 = (cfz[])((eeh) (obj1)).b;
                    j1 = obj1.length;
                    j = 0;
                    while (j < j1) 
                    {
                        s2 = obj1[j];
                        if (s2 == null)
                        {
                            eev.b("Babel", "-- entity: null");
                        } else
                        {
                            s = String.valueOf(((cfz) (s2)).e);
                            obj2 = String.valueOf(((cfz) (s2)).f);
                            obj3 = String.valueOf(((cfz) (s2)).h);
                            s1 = String.valueOf(((cfz) (s2)).b);
                            s2 = String.valueOf(((cfz) (s2)).d);
                            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 70 + String.valueOf(obj2).length() + String.valueOf(obj3).length() + String.valueOf(s1).length() + String.valueOf(s2).length())).append("-- entity: displayName ").append(s).append(",firstName ").append(((String) (obj2))).append(",avatarUrl ").append(((String) (obj3))).append(",participantId ").append(s1).append(",circleId ").append(s2).toString());
                        }
                        j++;
                    }
                }
            }

        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (izy)kws.mergeFrom(new izy(), abyte0);
        if (a(((izy) (abyte0)).responseHeader))
        {
            return new cyd(((izy) (abyte0)).responseHeader);
        } else
        {
            return new cym(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        if (eev.a("Babel", 3))
        {
            if (b != null)
            {
                dgk = String.valueOf(l());
                eev.d("Babel", (new StringBuilder(String.valueOf(dgk).length() + 24)).append("GEBI Response for: ").append(dgk).append(" tag.").toString());
            } else
            {
                eev.d("Babel", "GEBI Response with null request!");
            }
        }
        if (!m() && g != null)
        {
            dny.a(aow1.f(), this);
        }
    }

    public List k()
    {
        return g;
    }

    public String l()
    {
        return ((cwh)b).b;
    }

    public boolean m()
    {
        return ((cwh)b).d;
    }

    public boolean n()
    {
        return ((cwh)b).c;
    }
}
