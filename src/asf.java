// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class asf
    implements aru, fsn, hjt, hkb, hke
{

    boolean a;
    boolean b;
    boolean c;
    public final ArrayList d = new ArrayList();
    final Context e;
    final int f;
    final bwf g;
    ech h;
    int i;
    List j;
    private final eci k = new asg(this);
    private final int l;
    private final ap m;
    private final String n = getClass().getName();

    public asf(Context context, hjm hjm1, int i1, ap ap1)
    {
        e = context;
        l = i1;
        m = ap1;
        f = ((gmo)hgx.a(context, gmo)).a();
        g = (bwf)hgx.a(context, bwf);
        hjm1.a(this);
    }

    private List a(amf amf1, atd atd1)
    {
        ArrayList arraylist = new ArrayList();
        d.clear();
        if (a)
        {
            for (Iterator iterator = amf1.j().iterator(); iterator.hasNext();)
            {
                Object obj3 = (ame)iterator.next();
                if (!((ame) (obj3)).f())
                {
                    d.add(new arv(((ame) (obj3))));
                    Object obj1 = ((ame) (obj3)).e();
                    Object obj = amf1.e();
                    Object obj2;
                    if (TextUtils.isEmpty(((CharSequence) (obj1))))
                    {
                        obj1 = obj;
                        if (TextUtils.isEmpty(((CharSequence) (obj))))
                        {
                            obj1 = null;
                        }
                    }
                    obj = ((ame) (obj3)).c();
                    obj2 = ((ame) (obj3)).b();
                    if (((List) (obj)).isEmpty())
                    {
                        obj = null;
                    } else
                    {
                        obj = ((amd)((List) (obj)).get(0)).b();
                    }
                    if (((List) (obj2)).isEmpty())
                    {
                        obj2 = null;
                    } else
                    {
                        obj2 = ((aml)((List) (obj2)).get(0)).b();
                    }
                    String s;
                    int i1;
                    if (obj == null)
                    {
                        if (obj2 != null)
                        {
                            obj = ebz.p(((String) (obj2)));
                        } else
                        {
                            obj = null;
                        }
                    }
                    if (obj1 != null)
                    {
                        obj2 = obj1;
                        obj1 = obj;
                        obj = obj2;
                    } else
                    {
                        obj1 = null;
                    }
                    obj2 = obj;
                    if (obj == null)
                    {
                        obj = String.valueOf(ebw.b(((ame) (obj3)).a()));
                        if (((String) (obj)).length() != 0)
                        {
                            obj = "No metadata for contact with gaia id: ".concat(((String) (obj)));
                        } else
                        {
                            obj = new String("No metadata for contact with gaia id: ");
                        }
                        ebw.c("Babel_ConvCreator", ((String) (obj)));
                        obj2 = e.getResources().getString(g.jP);
                    }
                    obj = ((ame) (obj3)).d();
                    if (TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        obj = amf1.f();
                    }
                    arraylist.add(new eck(((String) (obj2)), ((String) (obj1)), ((String) (obj))));
                }
            }

        }
        if (c)
        {
            obj3 = amf1.b().iterator();
            while (((Iterator) (obj3)).hasNext()) 
            {
                obj = (aml)((Iterator) (obj3)).next();
                d.add(new arv(((aml) (obj))));
                if (atd1 == atd.c)
                {
                    i1 = g.jF;
                } else
                {
                    i1 = g.jG;
                }
                s = ((aml) (obj)).a();
                obj1 = ebz.p(((aml) (obj)).b());
                obj2 = obj1;
                obj = s;
                if (TextUtils.isEmpty(s))
                {
                    obj = obj1;
                    obj2 = null;
                }
                arraylist.add(new eck(((String) (obj)), ((String) (obj2)), i1));
            }
        }
        if (b)
        {
            for (amf1 = amf1.d().iterator(); amf1.hasNext(); arraylist.add(new eck(atd1.a(), atd1.b(), g.jE)))
            {
                atd1 = (amd)amf1.next();
                d.add(new arv(atd1));
            }

        }
        gbh.a("There must be as many choices as contact details", Integer.valueOf(arraylist.size()), Integer.valueOf(d.size()));
        return arraylist;
    }

    public String a()
    {
        String s = String.valueOf(getClass().getName());
        int i1 = l;
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i1).toString();
    }

    public void a(amf amf1, atd atd1, boolean flag)
    {
        if (flag)
        {
            i = g.jL;
            a = false;
            if (amf1.b().isEmpty() && amf1.d().isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gbh.b("An invited contact must have at least a phone number or email address", flag);
            if (!amf1.b().isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
            if (!c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = flag;
            if (c)
            {
                i = g.jN;
            }
            break MISSING_BLOCK_LABEL_96;
        } else
        {
            b = false;
            switch (ash.a[atd1.ordinal()])
            {
            default:
                amf1 = String.valueOf(atd1);
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(amf1).length() + 27)).append("Unknown conversation type: ").append(amf1).toString());

            case 1: // '\001'
                i = g.jK;
                a = true;
                c = false;
                break;

            case 2: // '\002'
                i = g.jN;
                a = false;
                c = true;
                break;

            case 3: // '\003'
                i = g.jR;
                a = true;
                c = true;
                break;

            case 4: // '\004'
                i = g.jQ;
                a = true;
                c = false;
                break;
            }
            continue;
        }
        do
        {
            j = a(amf1, atd1);
            gbh.b("No contact details found", d.isEmpty());
            if (d.size() == 1)
            {
                ((arw)hgx.a(e, arw)).a((arv)d.get(0));
                return;
            }
            g.a(f, 2510).d();
            if (a)
            {
                g.a(f, 2554).d();
            }
            if (c)
            {
                g.a(f, 2557).d();
            }
            if (b)
            {
                g.a(f, 2560).d();
            }
            h = ((ecj)hgx.a(e, ecj)).a(e.getResources().getString(i), j);
            h.a(k);
            h.a(m, n);
            break;
        } while (true);
        return;
    }

    public void a(Bundle bundle)
    {
        int i1 = 0;
        if (bundle != null)
        {
            d.addAll((ArrayList)bundle.getSerializable("contact_details"));
            i = bundle.getInt("selector_dialog_title_id", 0);
            j = null;
            bundle = bundle.getBundle("selector_dialog_choices");
            if (bundle != null)
            {
                j = new ArrayList(bundle.size());
                for (; i1 < bundle.size(); i1++)
                {
                    j.add((eck)bundle.getSerializable((new StringBuilder(11)).append(i1).toString()));
                }

            }
            if (i > 0 && j != null && j.size() > 1)
            {
                bundle = m.a(n);
                bg bg1 = m.a();
                if (bundle != null)
                {
                    bg1.a(bundle);
                }
                h = ((ecj)hgx.a(e, ecj)).a(e.getResources().getString(i), j);
                h.a(k);
                h.a(bg1, n);
            }
        }
    }

    public void b(Bundle bundle)
    {
        bundle.putSerializable("contact_details", d);
        if (i > 0)
        {
            bundle.putInt("selector_dialog_title_id", i);
        }
        if (j != null)
        {
            Bundle bundle1 = new Bundle(j.size());
            Iterator iterator = j.iterator();
            for (int i1 = 0; iterator.hasNext(); i1++)
            {
                eck eck1 = (eck)iterator.next();
                bundle1.putSerializable((new StringBuilder(11)).append(i1).toString(), eck1);
            }

            bundle.putBundle("selector_dialog_choices", bundle1);
        }
        i = 0;
        j = null;
    }
}
