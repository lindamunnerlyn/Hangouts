// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class bdj extends AsyncTask
{

    final bdg a;

    bdj(bdg bdg1)
    {
        a = bdg1;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        ArrayList arraylist;
        Object obj;
        aobj = String.valueOf(a.b);
        if (((String) (aobj)).length() != 0)
        {
            aobj = "update albumId=".concat(((String) (aobj)));
        } else
        {
            aobj = new String("update albumId=");
        }
        eev.c("Babel_Stickers", ((String) (aobj)));
        arraylist = new ArrayList();
        obj = ((bds)a.getTargetFragment()).a;
        if (a.b != null && !((List) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        aobj = a.b;
        obj = String.valueOf(obj);
        eev.g("Babel_Stickers", (new StringBuilder(String.valueOf(((Object) (aobj))).length() + 21 + String.valueOf(obj).length())).append("Missing album:").append(((String) (aobj))).append(" cache:").append(((String) (obj))).toString());
_L4:
        return arraylist;
_L2:
        aobj = String.valueOf(a.b);
        if (((String) (aobj)).length() != 0)
        {
            aobj = "Updating! - ".concat(((String) (aobj)));
        } else
        {
            aobj = new String("Updating! - ");
        }
        eev.g("Babel_Stickers", ((String) (aobj)));
        aobj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (aobj)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (cyz)((Iterator) (aobj)).next();
        } while (!a.b.equals(((cyz) (obj)).a));
        aobj = ((cyz) (obj)).e.iterator();
        while (((Iterator) (aobj)).hasNext()) 
        {
            cza cza1 = (cza)((Iterator) (aobj)).next();
            bdk bdk1 = new bdk(a);
            bdk1.b = cza1.b;
            bdk1.a = cza1.a;
            bdk1.c = cza1.c;
            arraylist.add(bdk1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onPostExecute(Object obj)
    {
        obj = (ArrayList)obj;
        a.a(a.a, ((ArrayList) (obj)));
    }
}
