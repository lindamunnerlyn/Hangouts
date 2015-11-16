// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.util.List;

final class axt extends AsyncTask
{

    final avv a;

    axt(avv avv1)
    {
        a = avv1;
        super();
    }

    private transient Void a(aym aaym[])
    {
        aym aym1;
        ContentResolver contentresolver;
        aym1 = aaym[0];
        if (avv.W())
        {
            aaym = String.valueOf(aym1);
            eev.b("Babel", (new StringBuilder(String.valueOf(aaym).length() + 39)).append("updateContactStatTracker -- recipient: ").append(aaym).toString());
        }
        contentresolver = avv.bE(a).getContentResolver();
        if (aym1.c != null) goto _L2; else goto _L1
_L1:
        aym1.e = true;
        if (TextUtils.isEmpty(aym1.b.a)) goto _L4; else goto _L3
_L3:
        doy doy1 = doy.a();
        if (!doy1.c()) goto _L6; else goto _L5
_L5:
        aaym = doy1.a(aym1.b.a);
        if (aaym == null) goto _L6; else goto _L7
_L7:
        aaym = aaym.g();
        if (aaym.isEmpty())
        {
            break MISSING_BLOCK_LABEL_568;
        }
        aaym = ((bhy)aaym.get(0)).a;
_L27:
        if (TextUtils.isEmpty(aaym)) goto _L6; else goto _L8
_L8:
        if (!avv.W()) goto _L10; else goto _L9
_L9:
        Object obj;
        String s;
        obj = String.valueOf("updateContactStatTracker by gaia. email: ");
        s = String.valueOf(aaym);
        if (s.length() == 0) goto _L12; else goto _L11
_L11:
        obj = ((String) (obj)).concat(s);
_L20:
        eev.b("Babel", ((String) (obj)));
_L10:
        obj = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI;
        long l = aym1.a;
        aaym = contentresolver.query(((Uri) (obj)), new String[] {
            "_id"
        }, "contact_id=? and data1=?", new String[] {
            String.valueOf(l), aaym
        }, null);
_L26:
        doy1.b();
_L23:
        if (aaym == null) goto _L14; else goto _L13
_L13:
        if (!aaym.moveToNext()) goto _L14; else goto _L15
_L15:
        aym1.c = aaym.getString(0);
        if (!avv.W()) goto _L14; else goto _L16
_L16:
        obj = String.valueOf(aym1.c);
        if (((String) (obj)).length() == 0) goto _L18; else goto _L17
_L17:
        obj = "updateContactStatTracker dataId: ".concat(((String) (obj)));
_L24:
        eev.b("Babel", ((String) (obj)));
_L14:
        if (aaym != null)
        {
            aaym.close();
        }
        if (!TextUtils.isEmpty(aym1.c)) goto _L2; else goto _L19
_L19:
        if (avv.W())
        {
            eev.b("Babel", "updateContactStatTracker -- null data id");
        }
_L22:
        return null;
_L12:
        obj = new String(((String) (obj)));
          goto _L20
        aaym;
        doy1.b();
        throw aaym;
_L4:
        if (TextUtils.isEmpty(aym1.d)) goto _L22; else goto _L21
_L21:
        if (avv.W())
        {
            eev.b("Babel", "updateContactStatTracker by phone number");
        }
        aaym = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        long l1 = aym1.a;
        obj = aym1.d;
        aaym = contentresolver.query(aaym, new String[] {
            "_id"
        }, "contact_id=? and data1=?", new String[] {
            String.valueOf(l1), obj
        }, null);
          goto _L23
_L18:
        obj = new String("updateContactStatTracker dataId: ");
          goto _L24
        Exception exception;
        exception;
        if (aaym != null)
        {
            aaym.close();
        }
        throw exception;
_L2:
        aaym = android.provider.ContactsContract.DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(aym1.c).appendQueryParameter("type", "short_text").build();
        boolean flag;
        if (contentresolver.update(aaym, new ContentValues(), null, null) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!avv.W()) goto _L22; else goto _L25
_L25:
        aaym = String.valueOf(aaym);
        eev.b("Babel", (new StringBuilder(String.valueOf(aaym).length() + 52)).append("updateContactStatTracker -- success: ").append(flag).append(" for uri: ").append(aaym).toString());
        return null;
_L6:
        aaym = null;
          goto _L26
        aaym = null;
          goto _L27
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((aym[])aobj);
    }

    protected volatile void onPostExecute(Object obj)
    {
    }
}
