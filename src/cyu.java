// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class cyu extends cxr
{

    private static final long serialVersionUID = 1L;
    private String g;
    private String h;
    private final ArrayList i = new ArrayList();

    private cyu(hyh hyh1)
    {
        boolean flag = true;
        int j = 0;
        super(hyh1.apiHeader);
        hyh1 = hyh1.a.a;
        if (hyh1 != null)
        {
            g = ((iby) (hyh1)).a;
            Object obj = ((iby) (hyh1)).e;
            if (obj != null)
            {
                Object obj1 = ((ici) (obj)).g;
                Object obj2;
                if (obj1 != null)
                {
                    iat aiat[] = ((iau) (obj1)).b;
                    if (aiat.length > 0)
                    {
                        obj2 = aiat[0];
                        aiat = new cyv();
                        aiat.a = ((iat) (obj2)).a;
                        aiat.b = ((iat) (obj2)).b;
                        obj2 = ((iat) (obj2)).c;
                        if (obj2 == null)
                        {
                            aiat.d = cyv.a(null);
                            aiat.e = cyv.a(null);
                        } else
                        {
                            aiat.d = cyv.a(((ian) (obj2)).a);
                            aiat.e = cyv.a(((ian) (obj2)).b);
                        }
                        aiat.c = 1;
                        i.add(aiat);
                    }
                }
                aiat = ((ici) (obj)).h;
                if (aiat != null)
                {
                    aiat = ((ias) (aiat)).b;
                    if (aiat.length > 0)
                    {
                        obj2 = aiat[0];
                        aiat = new cyv();
                        aiat.a = ((iar) (obj2)).a;
                        obj2 = ((iar) (obj2)).c;
                        if (obj2 == null)
                        {
                            aiat.d = cyv.a(null);
                            aiat.e = cyv.a(null);
                        } else
                        {
                            aiat.d = cyv.a(((ian) (obj2)).a);
                            aiat.e = cyv.a(((ian) (obj2)).b);
                        }
                        aiat.c = 2;
                        i.add(aiat);
                    }
                }
                obj = ((ici) (obj)).i;
                if (obj != null)
                {
                    obj = ((ibf) (obj)).b;
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        aiat = new cyv();
                        aiat.a = ((String) (obj));
                        aiat.c = 3;
                        i.add(aiat);
                    }
                }
            }
            hyh1 = ((iby) (hyh1)).d;
            if (hyh1 != null)
            {
                hyh1 = ((iai) (hyh1)).j;
                if (hyh1 != null)
                {
                    obj = ((ibr) (hyh1)).e;
                    if (obj != null)
                    {
                        hyh1 = ((ibs) (obj)).a;
                    } else
                    {
                        hyh1 = ((ibr) (hyh1)).f;
                    }
                    obj = Uri.parse(hyh1);
                    hyh1 = (new android.net.Uri.Builder()).scheme(((Uri) (obj)).getScheme());
                    hyh1.authority(((Uri) (obj)).getHost());
                    obj = ((Uri) (obj)).getPathSegments();
                    if (((List) (obj)).size() != 6)
                    {
                        flag = false;
                    }
                    for (; j < ((List) (obj)).size(); j++)
                    {
                        if (j != 4 || !flag)
                        {
                            hyh1.appendPath((String)((List) (obj)).get(j));
                        }
                    }

                    h = hyh1.build().toString();
                }
            }
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (hyh)kws.mergeFrom(new hyh(), abyte0);
        if (a(((hyh) (abyte0)).apiHeader))
        {
            return new cyd(((hyh) (abyte0)).apiHeader);
        } else
        {
            return new cyu(abyte0);
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
