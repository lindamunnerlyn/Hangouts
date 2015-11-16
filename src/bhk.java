// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.View;
import java.util.Iterator;
import java.util.List;

public final class bhk extends aaf
{

    private final aoa a;

    public bhk(Context context, aoa aoa)
    {
        super(context);
        a = aoa;
    }

    public View a(Context context)
    {
        return new egm(context, a);
    }

    public void a(View view, int i, Cursor cursor)
    {
        egm egm1 = (egm)view;
        Object obj = (bhl)cursor;
        if (obj == null)
        {
            return;
        }
        fth fth1 = ((bhl) (obj)).a();
        bhn bhn1 = ((bhl) (obj)).c();
        int j = ((bhl) (obj)).e();
        int k = ((bhl) (obj)).d();
        view = ((bhm)a(i)).a();
        i = 15;
        if (k == 1)
        {
            i = 7;
        }
        if (view == null)
        {
            view = null;
        } else
        {
            view = view.toString();
        }
        egm1.a(view);
        if (fth1 != null)
        {
            j = i;
            if (!((bhl) (obj)).f())
            {
                j = i & -4;
            }
            String s;
            String s1;
            if (bhn1 == null)
            {
                view = null;
            } else
            {
                view = bhn1.b();
            }
            cursor = fth1.e();
            if (fth1.f() && !TextUtils.isEmpty(cursor))
            {
                obj = fth1.h();
                cursor = null;
            } else
            {
                obj = (Long)fth1.b().iterator().next();
                cursor = String.valueOf(obj);
                obj = dou.a(((Long) (obj)));
            }
            s1 = fth1.a();
            s = s1;
            if (TextUtils.isEmpty(s1))
            {
                s = bhv.c(fth1);
            }
            egm1.a(cursor, s, ((String) (obj)), ((String) (obj)), 0, k, bhv.a(fth1, view), bhn1, j);
            return;
        }
        bhv bhv1 = ((bhl) (obj)).b();
        switch (j)
        {
        default:
            eev.g("Babel", "CallContactsAdapter is given an unsupported contact type!");
            return;

        case 0: // '\0'
            break;
        }
        if (k == 1)
        {
            eev.g("Babel", "Local contacts not returning AggregatedPerson!");
        }
        if (k == 2)
        {
            cursor = ((bhl) (obj)).getString(0);
            view = null;
        } else
        {
            cursor = ((bia)bhv1.f().get(0)).a();
            view = ((bhl) (obj)).getString(2);
            i |= 0x10;
        }
        egm1.a(view, cursor, null, null, j, k, bhv1, bhn1, i);
    }

    public void a(bgx bgx)
    {
        int j = b();
        for (int i = 0; i < j; i++)
        {
            Cursor cursor = b(i);
            if (cursor != null)
            {
                ((bhl)cursor).a(bgx);
            }
        }

    }
}
