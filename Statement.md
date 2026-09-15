# Problem Statement
Often people are required to log entry as quickly and efficiently as possible. In fields like journalists covering disasters like earthquakes, floods, conflict zones or war, emergency response they need to record events, observations, and timestamps quickly and reliably, often under unstable conditions (no internet, limited time, high-pressure environments). Existing solutions like note-taking apps or cloud-based tools depend on internet connectivity, drain battery with heavy interfaces, or risk losing data if a device crashes mid-session. There's a need for a lightweight, offline-first tool that captures what happened and when, with minimal friction and no risk of losing prior entries. This program can run easily on a command line interface and does not require internet connectivity to run after installation.
# Scope of the project
- A command-line tool for logging short, timestamped text entries during field reporting
- Local file-based storage in form of simple txt file where no internet or account required to log entry
- Core actions: log an entry, view all entries, undo the last entry (for correcting mistakes), and clear the log (for starting a new assignment or wiping sensitive data)

# Target users
- Journalists and reporters that need to log and record the entry as quickly as possible especially ones reporting from disaster zones or breaking-news situations
- Field researchers, humanitarian workers, or citizen journalists who need a simple incident/observation log while working in the field
- Event organizers who want to record the timeline of the organised evnts
- General users that want to log events conveniently and quickly

# High level features
- Quick entry logging: Simply pu the event description in the CLI after choosing the required option; the system automatically timestamps it
- Can be instantly reviewed: Pulls up the full chronological log on choosing the appropriate option
- Undo safety net: lets the user correct and clear the last entry without manually editing the file
- Clear/reset with confirmation: lets the user wipe the log between assignments, with a safeguard against accidental data loss
- Privacy and security: Logs saved locally in a txt file so low chance of data breach unlike in cloud based services
- Log file storage: File log saved quickly after the entry
- Ease of usage: No account or internet required after installation logs are saved locally.
