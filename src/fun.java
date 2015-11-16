// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.signin.GoogleSignInAccount;

public final class fun
    implements android.os.Parcelable.Creator
{

    public fun()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        Uri uri = null;
        int j = g.a(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = g.i(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = g.i(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = g.i(parcel, k);
                    break;

                case 5: // '\005'
                    s = g.i(parcel, k);
                    break;

                case 6: // '\006'
                    uri = (Uri)g.a(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GoogleSignInAccount(i, s3, s2, s1, s, uri);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new GoogleSignInAccount[i];
    }
}
