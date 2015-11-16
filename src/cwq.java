// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class cwq extends cvn
{

    private static final long serialVersionUID = 1L;
    private String g;
    private String h;
    private final ArrayList i = new ArrayList();

    private cwq(htd htd1)
    {
        boolean flag = true;
        int j = 0;
        super(htd1.apiHeader);
        htd1 = htd1.a.a;
        if (htd1 != null)
        {
            g = ((hwu) (htd1)).a;
            Object obj = ((hwu) (htd1)).e;
            if (obj != null)
            {
                Object obj1 = ((hxe) (obj)).g;
                Object obj2;
                if (obj1 != null)
                {
                    hvp ahvp[] = ((hvq) (obj1)).b;
                    if (ahvp.length > 0)
                    {
                        obj2 = ahvp[0];
                        ahvp = new cwr();
                        ahvp.a = ((hvp) (obj2)).a;
                        ahvp.b = ((hvp) (obj2)).b;
                        obj2 = ((hvp) (obj2)).c;
                        if (obj2 == null)
                        {
                            ahvp.d = cwr.a(null);
                            ahvp.e = cwr.a(null);
                        } else
                        {
                            ahvp.d = cwr.a(((hvj) (obj2)).a);
                            ahvp.e = cwr.a(((hvj) (obj2)).b);
                        }
                        ahvp.c = 1;
                        i.add(ahvp);
                    }
                }
                ahvp = ((hxe) (obj)).h;
                if (ahvp != null)
                {
                    ahvp = ((hvo) (ahvp)).b;
                    if (ahvp.length > 0)
                    {
                        obj2 = ahvp[0];
                        ahvp = new cwr();
                        ahvp.a = ((hvn) (obj2)).a;
                        obj2 = ((hvn) (obj2)).c;
                        if (obj2 == null)
                        {
                            ahvp.d = cwr.a(null);
                            ahvp.e = cwr.a(null);
                        } else
                        {
                            ahvp.d = cwr.a(((hvj) (obj2)).a);
                            ahvp.e = cwr.a(((hvj) (obj2)).b);
                        }
                        ahvp.c = 2;
                        i.add(ahvp);
                    }
                }
                obj = ((hxe) (obj)).i;
                if (obj != null)
                {
                    obj = ((hwb) (obj)).b;
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        ahvp = new cwr();
                        ahvp.a = ((String) (obj));
                        ahvp.c = 3;
                        i.add(ahvp);
                    }
                }
            }
            htd1 = ((hwu) (htd1)).d;
            if (htd1 != null)
            {
                htd1 = ((hve) (htd1)).j;
                if (htd1 != null)
                {
                    obj = ((hwn) (htd1)).e;
                    if (obj != null)
                    {
                        htd1 = ((hwo) (obj)).a;
                    } else
                    {
                        htd1 = ((hwn) (htd1)).f;
                    }
                    obj = Uri.parse(htd1);
                    htd1 = (new android.net.Uri.Builder()).scheme(((Uri) (obj)).getScheme());
                    htd1.authority(((Uri) (obj)).getHost());
                    obj = ((Uri) (obj)).getPathSegments();
                    if (((List) (obj)).size() != 6)
                    {
                        flag = false;
                    }
                    for (; j < ((List) (obj)).size(); j++)
                    {
                        if (j != 4 || !flag)
                        {
                            htd1.appendPath((String)((List) (obj)).get(j));
                        }
                    }

                    h = htd1.build().toString();
                }
            }
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (htd)kop.mergeFrom(new htd(), abyte0);
        if (a(((htd) (abyte0)).apiHeader))
        {
            return new cvz(((htd) (abyte0)).apiHeader);
        } else
        {
            return new cwq(abyte0);
        }
    }

    public Uri k()
    {
        if (h != null)
        {
            return Uri.parse(h);
        } else
        {
            return null;
        }
    }

    public String l()
    {
        return g;
    }

    public ArrayList m()
    {
        return i;
    }
}
