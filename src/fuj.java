// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;

public final class fuj
    implements android.os.Parcelable.Creator
{

    public fuj()
    {
    }

    public static void a(GetAllCapabilitiesResponse getallcapabilitiesresponse, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, getallcapabilitiesresponse.a);
        g.b(parcel, 2, getallcapabilitiesresponse.b);
        g.c(parcel, 3, getallcapabilitiesresponse.c);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = g.a(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = g.e(parcel, l);
                    break;

                case 3: // '\003'
                    arraylist = g.c(parcel, l, CapabilityInfoParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetAllCapabilitiesResponse(i, j, arraylist);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new GetAllCapabilitiesResponse[i];
    }
}
