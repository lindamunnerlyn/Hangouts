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

final class axg extends AsyncTask
{

    final ave a;

    axg(ave ave1)
    {
        a = ave1;
        super();
    }

    private transient Void a(axy aaxy[])
    {
        axy axy1;
        ContentResolver contentresolver;
        axy1 = aaxy[0];
        if (ave.W())
        {
            aaxy = String.valueOf(axy1);
            ebw.b("Babel", (new StringBuilder(String.valueOf(aaxy).length() + 39)).append("updateContactStatTracker -- recipient: ").append(aaxy).toString());
        }
        contentresolver = ave.bH(a).getContentResolver();
        if (axy1.c != null) goto _L2; else goto _L1
_L1:
        axy1.e = true;
        if (TextUtils.isEmpty(axy1.b.a)) goto _L4; else goto _L3
_L3:
        dme dme1 = dme.a();
        if (!dme1.c()) goto _L6; else goto _L5
_L5:
        aaxy = dme1.a(axy1.b.a);
        if (aaxy == null) goto _L6; else goto _L7
_L7:
        aaxy = aaxy.g();
        if (aaxy.isEmpty())
        {
            break MISSING_BLOCK_LABEL_568;
        }
        aaxy = ((bhm)aaxy.get(0)).a;
_L27:
        if (TextUtils.isEmpty(aaxy)) goto _L6; else goto _L8
_L8:
        if (!ave.W()) goto _L10; else goto _L9
_L9:
        Object obj;
        String s;
        obj = String.valueOf("updateContactStatTracker by gaia. email: ");
        s = String.valueOf(aaxy);
        if (s.length() == 0) goto _L12; else goto _L11
_L11:
        obj = ((String) (obj)).concat(s);
_L20:
        ebw.b("Babel", ((String) (obj)));
_L10:
        obj = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI;
        long l = axy1.a;
        aaxy = contentresolver.query(((Uri) (obj)), new String[] {
            "_id"
        }, "contact_id=? and data1=?", new String[] {
            String.valueOf(l), aaxy
        }, null);
_L26:
        dme1.b();
_L23:
        if (aaxy == null) goto _L14; else goto _L13
_L13:
        if (!aaxy.moveToNext()) goto _L14; else goto _L15
_L15:
        axy1.c = aaxy.getString(0);
        if (!ave.W()) goto _L14; else goto _L16
_L16:
        obj = String.valueOf(axy1.c);
        if (((String) (obj)).length() == 0) goto _L18; else goto _L17
_L17:
        obj = "updateContactStatTracker dataId: ".concat(((String) (obj)));
_L24:
        ebw.b("Babel", ((String) (obj)));
_L14:
        if (aaxy != null)
        {
            aaxy.close();
        }
        if (!TextUtils.isEmpty(axy1.c)) goto _L2; else goto _L19
_L19:
        if (ave.W())
        {
            ebw.b("Babel", "updateContactStatTracker -- null data id");
        }
_L22:
        return null;
_L12:
        obj = new String(((String) (obj)));
          goto _L20
        aaxy;
        dme1.b();
        throw aaxy;
_L4:
        if (TextUtils.isEmpty(axy1.d)) goto _L22; else goto _L21
_L21:
        if (ave.W())
        {
            ebw.b("Babel", "updateContactStatTracker by phone number");
        }
        aaxy = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        long l1 = axy1.a;
        obj = axy1.d;
        aaxy = contentresolver.query(aaxy, new String[] {
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
        if (aaxy != null)
        {
            aaxy.close();
        }
        throw exception;
_L2:
        aaxy = android.provider.ContactsContract.DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(axy1.c).appendQueryParameter("type", "short_text").build();
        boolean flag;
        if (contentresolver.update(aaxy, new ContentValues(), null, null) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!ave.W()) goto _L22; else goto _L25
_L25:
        aaxy = String.valueOf(aaxy);
        ebw.b("Babel", (new StringBuilder(String.valueOf(aaxy).length() + 52)).append("updateContactStatTracker -- success: ").append(flag).append(" for uri: ").append(aaxy).toString());
        return null;
_L6:
        aaxy = null;
          goto _L26
        aaxy = null;
          goto _L27
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((axy[])aobj);
    }

    protected volatile void onPostExecute(Object obj)
    {
    }
}
