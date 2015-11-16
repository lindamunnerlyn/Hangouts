// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ListAdapter;

public final class bun extends gmd
{

    private btu aj;
    private final Handler ak = new Handler(Looper.getMainLooper());
    private gmf al;

    public bun()
    {
    }

    static ListAdapter a(bun bun1)
    {
        return bun1.t();
    }

    static void a(bun bun1, gmh gmh1, gmh gmh2, btv btv1)
    {
        bun1.a(gmh1, gmh2, btv1);
    }

    private void a(gmh gmh1, gmh gmh2, btv btv1)
    {
        Object obj = getActivity().getResources();
        android.content.res.ColorStateList colorstatelist = ((Resources) (obj)).getColorStateList(g.md);
        android.graphics.drawable.Drawable drawable = ((Resources) (obj)).getDrawable(g.me);
        android.graphics.drawable.Drawable drawable1 = ((Resources) (obj)).getDrawable(g.mi);
        android.graphics.drawable.Drawable drawable2 = ((Resources) (obj)).getDrawable(g.ml);
        android.graphics.drawable.Drawable drawable3 = ((Resources) (obj)).getDrawable(g.mh);
        obj = ((Resources) (obj)).getDrawable(g.mk);
        if (btv1 == btv.c)
        {
            gmh1.a(colorstatelist).a(drawable3).b(drawable);
            gmh2.a(null).a(drawable2).b(null);
        } else
        if (btv1 == btv.d)
        {
            gmh2.a(colorstatelist).a(((android.graphics.drawable.Drawable) (obj))).b(drawable);
            gmh1.a(null).a(drawable1).b(null);
            return;
        }
    }

    static btu b(bun bun1)
    {
        return bun1.aj;
    }

    static gmf c(bun bun1)
    {
        return bun1.al;
    }

    static void d(bun bun1)
    {
        buz buz1 = (buz)hgx.a(bun1.getActivity(), buz);
        Resources resources = bun1.getActivity().getResources();
        String s1 = bnd.a().t().f();
        String s2 = resources.getString(h.hZ, new Object[] {
            s1
        });
        ((ClipboardManager)bun1.getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(resources.getString(h.hY), s1));
        bun1.ak.postDelayed(new bup(bun1, buz1, s2), 100L);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        aj = (btu)hgx.a(activity, btu);
    }

    protected String q()
    {
        return getActivity().getResources().getString(h.hX);
    }

    protected android.widget.AdapterView.OnItemClickListener r()
    {
        return new buo(this);
    }

    protected ListAdapter s()
    {
        btv btv1 = aj.a();
        Object obj1 = getActivity().getResources();
        Object obj = aj.c();
        String s1;
        Object obj2;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = ((Resources) (obj1)).getString(h.ig);
        } else
        {
            obj = ((Resources) (obj1)).getString(h._fldif, new Object[] {
                obj
            });
        }
        obj2 = ((Resources) (obj1)).getString(h.ih);
        s1 = ((Resources) (obj1)).getString(h.ia);
        obj = new gmh(0, ((String) (obj)));
        obj2 = new gmh(1, ((String) (obj2)));
        obj1 = (new gmh(2, s1)).a(((Resources) (obj1)).getDrawable(g.mf));
        a(((gmh) (obj)), ((gmh) (obj2)), btv1);
        al = new gmf(getActivity());
        al.add(obj);
        al.add(obj2);
        al.add(new gmi());
        al.add(obj1);
        return al;
    }
}
