// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;
import java.util.Locale;

public final class bmi extends cnh
{

    private static final boolean w = false;
    private final String A;
    private final int B;
    private final String C;
    private final Integer D[];
    private final en x = new en(this);
    private final ani y;
    private final String z[];

    bmi(Context context, ani ani1, String as[], String s, int i, String s1, Integer ainteger[])
    {
        super(context, ani1);
        a(EsProvider.i);
        y = ani1;
        z = as;
        A = s;
        B = i;
        C = s1;
        D = ainteger;
    }

    public static bmj newBuilder(Context context, ani ani1, String as[])
    {
        return new bmj(context, ani1, as);
    }

    public Object d()
    {
        return h();
    }

    public Cursor h()
    {
        Object obj1 = y;
        String as[] = z;
        String s = A;
        int i = B;
        Object obj = C;
        Integer ainteger[];
        int k;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            if (i > 0)
            {
                obj = EsProvider.a(((ani) (obj1)).h(), i);
            } else
            {
                obj = EsProvider.a(EsProvider.i, ((ani) (obj1)).h());
            }
        } else
        if (i > 0)
        {
            obj = EsProvider.a(((ani) (obj1)).h(), ((String) (obj)), i);
        } else
        {
            obj = EsProvider.a(((ani) (obj1)).h(), ((String) (obj)));
        }
        ainteger = D;
        k = ainteger.length;
        for (i = 0; i < k; i++)
        {
            obj = EsProvider.b(((android.net.Uri) (obj)), g.a(ainteger[i], 0));
        }

        ContentResolver contentresolver = g.nS.getContentResolver();
        String s1 = String.format(Locale.US, "%s != '' AND %s != ?", new Object[] {
            "name", "chat_id"
        });
        obj1 = ((ani) (obj1)).b().b;
        s = String.format(Locale.US, "%s", new Object[] {
            s
        });
        obj = contentresolver.query(((android.net.Uri) (obj)), as, s1, new String[] {
            obj1
        }, s);
        if (w)
        {
            int j = ((Cursor) (obj)).getCount();
            ebw.b("Babel", (new StringBuilder(58)).append("getSuggestedPeople returned cursor with length ").append(j).toString());
        }
        if (obj != null)
        {
            ((Cursor) (obj)).registerContentObserver(x);
        }
        return ((Cursor) (obj));
    }

    static 
    {
        hik hik = ebw.e;
    }
}
