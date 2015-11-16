// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.DraftService;

public class any
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new anz();
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;

    public any()
    {
    }

    public any(Cursor cursor)
    {
        b = cursor.getString(5);
        c = cursor.getString(12);
        d = cursor.getString(13);
        String s;
        if (TextUtils.isEmpty(d))
        {
            s = null;
        } else
        {
            s = d;
        }
        d = s;
        e = cursor.getInt(14);
        f = cursor.getString(15);
        g = cursor.getString(16);
        if (DraftService.a())
        {
            cursor = String.valueOf(this);
            eev.b("Babel", (new StringBuilder(String.valueOf(cursor).length() + 28)).append("DraftInfo create by cursor: ").append(cursor).toString());
        }
    }

    public any(String s, String s1, String s2, int i, String s3, String s4)
    {
        b = s;
        c = s1;
        s = s2;
        if (TextUtils.isEmpty(s2))
        {
            s = null;
        }
        d = s;
        e = i;
        f = s3;
        g = s4;
        if (DraftService.a())
        {
            s = String.valueOf(this);
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 25)).append("DraftInfo create by arg: ").append(s).toString());
        }
    }

    private static void a(Parcel parcel, String s)
    {
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = null;
        }
        parcel.writeString(s1);
    }

    public boolean a()
    {
        return TextUtils.isEmpty(b) && TextUtils.isEmpty(c) && TextUtils.isEmpty(d);
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        String s = b;
        String s1 = c;
        String s2 = d;
        int i = e;
        String s3 = f;
        String s4 = g;
        return (new StringBuilder(String.valueOf(s).length() + 110 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append("DraftInfo mText: ").append(s).append(" mSubject: ").append(s1).append(" mAttachmentUrl: ").append(s2).append(" mPhotoRotation: ").append(i).append(" mPicasaId: ").append(s3).append(" mAttachmentContentType: ").append(s4).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a(parcel, b);
        a(parcel, c);
        a(parcel, d);
        parcel.writeInt(e);
        a(parcel, f);
        a(parcel, g);
    }

}
