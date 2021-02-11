# ViewModel-using-Java

- The ViewModel is a part of Android Architecture Components. 
- The ViewModel class is designed to hold and manage UI-related data in a life-cycle conscious way. 
- This allows data to survive configuration changes such as screen rotations.
- View model create in the memory when activity creates, it lives until the activity cleared from the memory and So ViewModel can hold value belong to the activity.

__Advantages of using ViewModel__

- Live through the configuration changes- If any configuration changes the data will live in ViewModel.
- No worry about leak memory
- Data will be always updated – If API is calling data from remote server the data will always update.
- Data will wait for you- If you call any APIs and that time you will rotate the phone and result delivered before activity recreation data will store in ViewModel and wait for   the re-creation of activity
