// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.wearable.PutDataRequest;

public final class fwy
    implements android.os.Parcelable.Creator
{

    public fwy()
    {
    }

    public static void a(PutDataRequest putdatarequest, Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, putdatarequest.a);
        g.a(parcel, 2, putdatarequest.a(), i);
        g.a(parcel, 4, putdatarequest.d());
        g.a(parcel, 5, putdatarequest.b());
        g.q(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        int j = g.a(parcel);
        android.os.Bundle bundle = null;
        Uri uri = null;
        int i = 0;
        byte abyte0[] = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 3: // '\003'
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    uri = (Uri)g.a(parcel, k, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    bundle = g.k(parcel, k);
                    break;

                case 5: // '\005'
                    abyte0 = g.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PutDataRequest(i, uri, bundle, abyte0);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new PutDataRequest[i];
    }
}
