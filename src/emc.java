// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class emc
{

    final Intent a;

    emc(Intent intent)
    {
        a = new Intent(intent);
    }

    public emc(String s)
    {
        this((new Intent(s)).setPackage("com.google.android.gms"));
    }

    public Intent a()
    {
        return a;
    }

    public emc a(String s)
    {
        return c(s);
    }

    public emc a(List list)
    {
        return b(list);
    }

    public emc b(String s)
    {
        return d(s);
    }

    emc b(List list)
    {
        c(list);
        return this;
    }

    emc c(String s)
    {
        a.putExtra("com.google.android.gms.common.acl.EXTRA_ACCOUNT_NAME", s);
        return this;
    }

    emc c(List list)
    {
        if (list == null)
        {
            list = Collections.EMPTY_LIST;
        }
        Intent intent = a;
        if (list instanceof ArrayList)
        {
            list = (ArrayList)list;
        } else
        {
            list = new ArrayList(list);
        }
        intent.putParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_INITIAL_AUDIENCE", list);
        return this;
    }

    emc d(String s)
    {
        fqa.a(s, "People qualified ID");
        AudienceMember audiencemember = AudienceMember.a(s);
        s = a;
        Parcel parcel = Parcel.obtain();
        audiencemember.writeToParcel(parcel, 0);
        byte abyte0[] = parcel.marshall();
        parcel.recycle();
        s.putExtra("com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON", abyte0);
        return this;
    }
}
