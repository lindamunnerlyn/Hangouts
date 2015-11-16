// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;

final class aki
    implements hjw
{

    final akf a;

    aki(akf akf1)
    {
        a = akf1;
        super();
    }

    public boolean a()
    {
        Object obj;
        String s;
        jti jti1;
        Iterator iterator;
        int i;
        i = 0;
        obj = a;
        s = eey.g(((akf) (obj)).a);
        jti1 = new jti();
        iterator = dcn.e(((akf) (obj)).c).x().iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s1;
        String s2;
        s1 = (String)iterator.next();
        s2 = eey.g(s1);
        if (s2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!s2.equals(s)) goto _L4; else goto _L3
_L3:
        obj = jth.b(((akf) (obj)).a);
_L6:
        if (((jth) (obj)).isEmpty())
        {
            Toast.makeText(a.b, g.iM, 0).show();
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        jti1.c(s1);
        continue; /* Loop/switch isn't completed */
_L2:
        obj = jti1.a();
        if (true) goto _L6; else goto _L5
_L5:
        if (((jth) (obj)).size() == 1)
        {
            akf.a(a, (String)jts.a(((Iterable) (obj)).iterator()));
            return true;
        }
        akf akf1 = a;
        String as[] = new String[((jth) (obj)).size()];
        for (obj = ((jth) (obj)).a(); ((Iterator) (obj)).hasNext();)
        {
            as[i] = eey.p((String)((Iterator) (obj)).next());
            i++;
        }

        (new android.app.AlertDialog.Builder(akf1.b)).setTitle(g.iQ).setItems(as, new akj(akf1, as)).setNegativeButton(0x1040009, null).show();
        return true;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
