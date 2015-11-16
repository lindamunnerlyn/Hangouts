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

public final class bva extends gqj
{

    private buh aj;
    private final Handler ak = new Handler(Looper.getMainLooper());
    private gql al;

    public bva()
    {
    }

    static ListAdapter a(bva bva1)
    {
        return bva1.t();
    }

    static void a(bva bva1, gqn gqn1, gqn gqn2, bui bui1)
    {
        bva1.a(gqn1, gqn2, bui1);
    }

    private void a(gqn gqn1, gqn gqn2, bui bui1)
    {
        Object obj = getActivity().getResources();
        android.content.res.ColorStateList colorstatelist = ((Resources) (obj)).getColorStateList(g.lR);
        android.graphics.drawable.Drawable drawable = ((Resources) (obj)).getDrawable(g.lS);
        android.graphics.drawable.Drawable drawable1 = ((Resources) (obj)).getDrawable(g.lW);
        android.graphics.drawable.Drawable drawable2 = ((Resources) (obj)).getDrawable(g.lZ);
        android.graphics.drawable.Drawable drawable3 = ((Resources) (obj)).getDrawable(g.lV);
        obj = ((Resources) (obj)).getDrawable(g.lY);
        if (bui1 == bui.c)
        {
            gqn1.a(colorstatelist).a(drawable3).b(drawable);
            gqn2.a(null).a(drawable2).b(null);
        } else
        if (bui1 == bui.d)
        {
            gqn2.a(colorstatelist).a(((android.graphics.drawable.Drawable) (obj))).b(drawable);
            gqn1.a(null).a(drawable1).b(null);
            return;
        }
    }

    static buh b(bva bva1)
    {
        return bva1.aj;
    }

    static gql c(bva bva1)
    {
        return bva1.al;
    }

    static void d(bva bva1)
    {
        bvm bvm1 = (bvm)hlp.a(bva1.getActivity(), bvm);
        Resources resources = bva1.getActivity().getResources();
        String s1 = bnk.a().s().f();
        String s2 = resources.getString(h.hE, new Object[] {
            s1
        });
        ((ClipboardManager)bva1.getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(resources.getString(h.hD), s1));
        bva1.ak.postDelayed(new bvc(bva1, bvm1, s2), 100L);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        aj = (buh)hlp.a(activity, buh);
    }

    protected String q()
    {
        return getActivity().getResources().getString(h.hC);
    }

    protected android.widget.AdapterView.OnItemClickListener r()
    {
        return new bvb(this);
    }

    protected ListAdapter s()
    {
        bui bui1 = aj.a();
        Object obj1 = getActivity().getResources();
        Object obj = aj.c();
        String s1;
        Object obj2;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = ((Resources) (obj1)).getString(h.hL);
        } else
        {
            obj = ((Resources) (obj1)).getString(h.hK, new Object[] {
                obj
            });
        }
        obj2 = ((Resources) (obj1)).getString(h.hM);
        s1 = ((Resources) (obj1)).getString(h.hF);
        obj = new gqn(0, ((String) (obj)));
        obj2 = new gqn(1, ((String) (obj2)));
        obj1 = (new gqn(2, s1)).a(((Resources) (obj1)).getDrawable(g.lT));
        a(((gqn) (obj)), ((gqn) (obj2)), bui1);
        al = new gql(getActivity());
        al.add(obj);
        al.add(obj2);
        al.add(new gqo());
        al.add(obj1);
        return al;
    }
}
