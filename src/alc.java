// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

final class alc
    implements br
{

    final alb a;

    alc(alb alb1)
    {
        a = alb1;
        super();
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        return new akv(a.b);
    }

    public void onLoadFinished(em em, Object obj)
    {
        Object obj1 = (ajl)obj;
        obj = a;
        em = a.a;
        obj1 = jnv.c(obj1);
        boolean flag;
        if (!eey.c(em.c()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.d(flag, "If CallerId is blocked, CallerId settings should never be loaded");
        if (((jnv) (obj1)).b() && !((ajl)((jnv) (obj1)).c()).a())
        {
            Object obj2 = (ajl)((jnv) (obj1)).c();
            em = ((alb) (obj)).b;
            obj1 = ((alb) (obj)).e;
            ddg ddg1 = ((alb) (obj)).a;
            int i = ((alb) (obj)).c;
            obj = ((alb) (obj)).d;
            String s = eey.g();
            obj2 = ((ajl) (obj2)).c();
            if (!TextUtils.isEmpty(s))
            {
                flag = ((String) (obj2)).equals(s);
            } else
            {
                flag = false;
            }
            obj = (new android.app.AlertDialog.Builder(em)).setTitle(g.iF).setNegativeButton(g.iC, new ajt(ddg1, i, ((String) (obj)), ((akx) (obj1)), em));
            if (flag)
            {
                ((android.app.AlertDialog.Builder) (obj)).setMessage(g.iD).setPositiveButton(g.iG, new aju(em, i));
            } else
            {
                ((android.app.AlertDialog.Builder) (obj)).setMessage(em.getString(g.iE, new Object[] {
                    eey.o(((String) (obj2)))
                }));
            }
            ((android.app.AlertDialog.Builder) (obj)).create().show();
            return;
        }
        em.a(((jnv) (obj1)));
        if (((jnv) (obj1)).b())
        {
            ((alb) (obj)).e.a(2249);
        }
        ((alb) (obj)).b.startActivity(em.a(((alb) (obj)).c, ((alb) (obj)).d));
        ((alb) (obj)).b.finish();
    }

    public void onLoaderReset(em em)
    {
    }
}
