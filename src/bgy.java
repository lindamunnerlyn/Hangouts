// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.View;
import java.util.Iterator;
import java.util.List;

public final class bgy extends aad
{

    private final ani a;

    public bgy(Context context, ani ani)
    {
        super(context);
        a = ani;
    }

    public View a(Context context)
    {
        return new edk(context, a);
    }

    public void a(View view, int i, Cursor cursor)
    {
        edk edk1 = (edk)view;
        Object obj = (bgz)cursor;
        if (obj == null)
        {
            return;
        }
        fqo fqo1 = ((bgz) (obj)).a();
        bhb bhb1 = ((bgz) (obj)).c();
        int j = ((bgz) (obj)).e();
        int k = ((bgz) (obj)).d();
        view = ((bha)a(i)).a();
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
        edk1.a(view);
        if (fqo1 != null)
        {
            j = i;
            if (!((bgz) (obj)).f())
            {
                j = i & -4;
            }
            String s;
            String s1;
            if (bhb1 == null)
            {
                view = null;
            } else
            {
                view = bhb1.b();
            }
            cursor = fqo1.e();
            if (fqo1.f() && !TextUtils.isEmpty(cursor))
            {
                obj = fqo1.h();
                cursor = null;
            } else
            {
                obj = (Long)fqo1.b().iterator().next();
                cursor = String.valueOf(obj);
                obj = dlw.a(((Long) (obj)));
            }
            s1 = fqo1.a();
            s = s1;
            if (TextUtils.isEmpty(s1))
            {
                s = bhj.c(fqo1);
            }
            edk1.a(cursor, s, ((String) (obj)), ((String) (obj)), 0, k, bhj.a(fqo1, view), bhb1, j);
            return;
        }
        bhj bhj1 = ((bgz) (obj)).b();
        switch (j)
        {
        default:
            ebw.g("Babel", "CallContactsAdapter is given an unsupported contact type!");
            return;

        case 0: // '\0'
            break;
        }
        if (k == 1)
        {
            ebw.g("Babel", "Local contacts not returning AggregatedPerson!");
        }
        if (k == 2)
        {
            cursor = ((bgz) (obj)).getString(0);
            view = null;
        } else
        {
            cursor = ((bho)bhj1.f().get(0)).a();
            view = ((bgz) (obj)).getString(2);
            i |= 0x10;
        }
        edk1.a(view, cursor, null, null, j, k, bhj1, bhb1, i);
    }

    public void a(bgl bgl)
    {
        int j = b();
        for (int i = 0; i < j; i++)
        {
            Cursor cursor = b(i);
            if (cursor != null)
            {
                ((bgz)cursor).a(bgl);
            }
        }

    }
}
