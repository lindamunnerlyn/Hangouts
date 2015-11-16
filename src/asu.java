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

final class asu
    implements asj, hon, hov, hoy, hoz
{

    boolean a;
    boolean b;
    boolean c;
    public final ArrayList d = new ArrayList();
    final Context e;
    final gcz f;
    efj g;
    int h;
    List i;
    private final efk j = new asv(this);
    private final int k;
    private final ap l;
    private final String m = getClass().getName();

    public asu(Context context, hof hof1, int i1, ap ap1)
    {
        e = context;
        k = i1;
        l = ap1;
        f = ((gdd)hlp.a(context, gdd)).a(((gqu)hlp.a(context, gqu)).a());
        hof1.a(this);
    }

    private List a(amx amx1, atu atu1)
    {
        ArrayList arraylist = new ArrayList();
        d.clear();
        if (a)
        {
            for (Iterator iterator = amx1.j().iterator(); iterator.hasNext();)
            {
                Object obj3 = (amw)iterator.next();
                if (!((amw) (obj3)).f())
                {
                    d.add(new ask(((amw) (obj3))));
                    Object obj1 = ((amw) (obj3)).e();
                    Object obj = amx1.e();
                    Object obj2;
                    if (TextUtils.isEmpty(((CharSequence) (obj1))))
                    {
                        obj1 = obj;
                        if (TextUtils.isEmpty(((CharSequence) (obj))))
                        {
                            obj1 = null;
                        }
                    }
                    obj = ((amw) (obj3)).c();
                    obj2 = ((amw) (obj3)).b();
                    if (((List) (obj)).isEmpty())
                    {
                        obj = null;
                    } else
                    {
                        obj = ((amv)((List) (obj)).get(0)).b();
                    }
                    if (((List) (obj2)).isEmpty())
                    {
                        obj2 = null;
                    } else
                    {
                        obj2 = ((and)((List) (obj2)).get(0)).b();
                    }
                    String s;
                    int i1;
                    if (obj == null)
                    {
                        if (obj2 != null)
                        {
                            obj = eey.p(((String) (obj2)));
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
                        obj = String.valueOf(eev.b(((amw) (obj3)).a()));
                        if (((String) (obj)).length() != 0)
                        {
                            obj = "No metadata for contact with gaia id: ".concat(((String) (obj)));
                        } else
                        {
                            obj = new String("No metadata for contact with gaia id: ");
                        }
                        eev.c("Babel_ConvCreator", ((String) (obj)));
                        obj2 = e.getResources().getString(g.jH);
                    }
                    obj = ((amw) (obj3)).d();
                    if (TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        obj = amx1.f();
                    }
                    arraylist.add(new efm(((String) (obj2)), ((String) (obj1)), ((String) (obj))));
                }
            }

        }
        if (c)
        {
            obj3 = amx1.b().iterator();
            while (((Iterator) (obj3)).hasNext()) 
            {
                obj = (and)((Iterator) (obj3)).next();
                d.add(new ask(((and) (obj))));
                if (atu1 == atu.c)
                {
                    i1 = g.jx;
                } else
                {
                    i1 = g.jy;
                }
                s = ((and) (obj)).a();
                obj1 = eey.p(((and) (obj)).b());
                obj2 = obj1;
                obj = s;
                if (TextUtils.isEmpty(s))
                {
                    obj = obj1;
                    obj2 = null;
                }
                arraylist.add(new efm(((String) (obj)), ((String) (obj2)), i1));
            }
        }
        if (b)
        {
            for (amx1 = amx1.d().iterator(); amx1.hasNext(); arraylist.add(new efm(atu1.a(), atu1.b(), g.jw)))
            {
                atu1 = (amv)amx1.next();
                d.add(new ask(atu1));
            }

        }
        gdv.a("There must be as many choices as contact details", Integer.valueOf(arraylist.size()), Integer.valueOf(d.size()));
        return arraylist;
    }

    public String a()
    {
        String s = String.valueOf(getClass().getName());
        int i1 = k;
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i1).toString();
    }

    public void a(amx amx1, atu atu1, boolean flag)
    {
        if (flag)
        {
            h = g.jD;
            a = false;
            if (amx1.b().isEmpty() && amx1.d().isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gdv.b("An invited contact must have at least a phone number or email address", flag);
            if (!amx1.b().isEmpty())
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
                h = g.jF;
            }
            break MISSING_BLOCK_LABEL_96;
        } else
        {
            b = false;
            switch (asw.a[atu1.ordinal()])
            {
            default:
                amx1 = String.valueOf(atu1);
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(amx1).length() + 27)).append("Unknown conversation type: ").append(amx1).toString());

            case 1: // '\001'
                h = g.jC;
                a = true;
                c = false;
                break;

            case 2: // '\002'
                h = g.jF;
                a = false;
                c = true;
                break;

            case 3: // '\003'
                h = g.jK;
                a = true;
                c = true;
                break;

            case 4: // '\004'
                h = g.jJ;
                a = true;
                c = false;
                break;
            }
            continue;
        }
        do
        {
            i = a(amx1, atu1);
            gdv.b("No contact details found", d.isEmpty());
            if (d.size() == 1)
            {
                ((asl)hlp.a(e, asl)).a((ask)d.get(0));
                return;
            }
            f.a(2510).d();
            if (a)
            {
                f.a(2554).d();
            }
            if (c)
            {
                f.a(2557).d();
            }
            if (b)
            {
                f.a(2560).d();
            }
            g = ((efl)hlp.a(e, efl)).a(e.getResources().getString(h), i);
            g.a(j);
            g.a(l, m);
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
            h = bundle.getInt("selector_dialog_title_id", 0);
            i = null;
            bundle = bundle.getBundle("selector_dialog_choices");
            if (bundle != null)
            {
                i = new ArrayList(bundle.size());
                for (; i1 < bundle.size(); i1++)
                {
                    i.add((efm)bundle.getSerializable((new StringBuilder(11)).append(i1).toString()));
                }

            }
            if (h > 0 && i != null && i.size() > 1)
            {
                bundle = l.a(m);
                bg bg1 = l.a();
                if (bundle != null)
                {
                    bg1.a(bundle);
                }
                g = ((efl)hlp.a(e, efl)).a(e.getResources().getString(h), i);
                g.a(j);
                g.a(bg1, m);
            }
        }
    }

    public void b(Bundle bundle)
    {
        bundle.putSerializable("contact_details", d);
        if (h > 0)
        {
            bundle.putInt("selector_dialog_title_id", h);
        }
        if (i != null)
        {
            Bundle bundle1 = new Bundle(i.size());
            Iterator iterator = i.iterator();
            for (int i1 = 0; iterator.hasNext(); i1++)
            {
                efm efm1 = (efm)iterator.next();
                bundle1.putSerializable((new StringBuilder(11)).append(i1).toString(), efm1);
            }

            bundle.putBundle("selector_dialog_choices", bundle1);
        }
        h = 0;
        i = null;
    }
}
